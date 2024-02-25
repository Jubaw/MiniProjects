package ticketreservation;
import java.util.Scanner;
public class TicketReservationAppRunner {

    /*
    1- Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir.
    2- Kullanıcıdan mesafe(Km), yolcu yaşı,yoLculuk tipi (Tek Yön, Gidis-Dönüs)ve koltuk no bilgilerini alinir.
    ( NOT: Koltuk numaralari 1-32 araliginda almalisin.)
    Kullanicidan alinan degerlen gecerli (mesafe ve yas degerleri pozitif sayı, volculuk tipi ise 1 veya 2) olmalıdır.
    Aksi halde kullaniciya "Hatali Veri Girdiniz!" seklinde bir uvant venilmelidir.
    3- Fiyat hesaplama kuralları;
        - Mesafe başına ücret:
         Tek yön 1 ₺/km      Çift yön 2₺/km (Gidiş - Dönüş)
        - Tekli koltuk ücreti:
        Koltuk no 3 veya 3'ün katı ise fiyat %20 daha fazladir(Tek yön: 1.2 Lira/km, Cift Yön:2.4 Lira/km).
        - ilk olarak seferin mesafe, yön ve koltuk no bilgisine göre fivati hesaplanir,
        sonrasinda kosullara göne asaidaki indirimler uygulanır;
        i-Çift yön indirimi ;
           "Yolculuk Tipi" gidis dönüs secilmis ise son bilet fivati üzerinden %20 indirim uygulanir.
        ii-Yas indirimi:
        Kisi 12 yasindan kücükse son bilet fivatz üzerinden %50 indinim uygulanir.
        Kisi 65 yasindan büyük ise son bilet fiyati üzerinden %30 indinim ugulanir.




     */
    public static void main(String[] args) {
        //1- Bilet rezervasyonu yapabilmek için otobüse ihtiyacımız var.
        Bus bus = new Bus("80 AB 80");
        //2- Bus Class'ın içinde
        //3-Bilet objesi oluşturalım.
        Ticket ticket = new Ticket();
        //7- Uygulamayı başlatan bir method
        start(bus,ticket);

    }

    private static void start(Bus bus, Ticket ticket) {
        Scanner scan = new Scanner(System.in);
        int select; //çıkış için kullanıcı 0 giricek.
        //8- Kullanıcıdan bilgileri alalım.
        do {
            System.out.println("---Bilet rezervasyon uygulamasına hoşgeldiniz---");
            System.out.println("Lütfen yaşınızı giriniz");
            int age = scan.nextInt();

            System.out.println("Lütfen yolculuk tipini giriniz.");
            System.out.println("1.Tek yön, 2.Gidiş-Dönüş");
            int type = scan.nextInt();

            System.out.println("Lütfen gidilecek mesafe bilgisini km olarak giriniz. ");
            double distance = scan.nextInt();

            System.out.println("Lütfen koltuk numarası giriniz");
            System.out.println("Tekli koltuk ücreti %20 daha fazladır.");
            System.out.println(bus.seats); //Mevcut koltuk noları
            String seat = scan.next();

            //Seçilen koltuk listede var mı ya da rezerve edilmiş mi ?
            boolean isReserved = !bus.seats.contains(seat);
            if (isReserved) {
                System.out.println("Seçtiğiniz koltuk rezerve edilmiştir.");
            }
            //Girilen değerler geçerli mi ?
            if (age > 0 && distance > 0 && (type == 1 || type == 2) && !isReserved) {
                //girilen değerler geçerliyse koltuğu listeden silicez.
                bus.seats.remove(seat);

                //bileti oluşturalım
                ticket.distance = distance;
                ticket.seatNo = seat;
                ticket.typeNo = type;
                ticket.getTotalPrice(age);
                //bileti yazdırma işlemi
                ticket.printTicket(bus);


            }else{
                System.out.println("Hatalı veri girdiniz");
            }
            System.out.println("Yeni işlem için bir sayı giriniz, çıkış için 0'ı seçiniz.");
            select = scan.nextInt();
        }while(select != 0);
        System.out.println("İyi günler diler, yine bekleriz.");

    }
}

