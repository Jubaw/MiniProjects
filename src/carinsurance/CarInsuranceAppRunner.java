package carinsurance;

import java.util.Scanner;

public class CarInsuranceAppRunner {
    /*
Proje: Araç Sigorta Prim Hesaplama
        Araç Tipleri: Otomobil,Kamyon,Motosiklet,Otobüs
                            -Otobüs: 18-30 koltuk ve ya 31 ve üstü koltuk


        Tarife dönemi: Aralık 2024, Haziran 2024
          1.Dönem: Haziran 2024                 2.Dönem Aralık 2024
          otomobil: 2000                        otomobil: 2500
          kamyon: 3000                          kamyon: 3500
          otobüs tip1: 4000 tip2:5000           otobüs tip1: 4500 otobüs tip2: 5500
          motosiklet: 1500                      motosiklet: 1750

          1-Tekrar tekrar kullanılan bir seçim menüsü (form) gösterelim. //while - switch
          2-Tarife dönemi bilgisi, araç tipi bilgilerini kullanıcıdan alalım. //Scanner
          3-Hatalı girişte hesaplama başarısız uyarısı verip, tekrar menü(form) gösterilsin. //Do-while
          4-Menüde yeni işlem veya çıkış için seçenek sunulsun. //
          5-Tarife dönemi ve araç tipine göre sigorta primi hesaplansın.//custom constructor



     */

    public static void main(String[] args) {
        //Uygulamayı başlatan method
        start();
    }

    private static void start() {
        //2.Kullanıcıdan bilgi alıcaz (Scanner)
        Scanner input = new Scanner(System.in);
        boolean isAgain;

        //3.Tekrar tekrar menü gösterilsin.
        do {
            System.out.println("--Zorunlu araç sigorta primi hesaplama");
            System.out.println("Tarife dönemi seçiniz");
            System.out.println("1.Haziran 2024");
            System.out.println("2.Aralık 2024");
            int donem = input.nextInt();
            String donemBilgi = donem == 1 ? "Haziran 2024" : "Aralık 2024";
            //Tarife dönemi doğru girilirse işleme devam etsin.
            if (donem == 1 || donem == 2){
                //4- bir araç objesi oluşturalım
                Car arac = new Car();//default
                System.out.println("Araç tipini seçiniz");
                System.out.println("otomobil,kamyon,motosiklet,otobüs");
                arac.type = input.next().toLowerCase();
                arac.primHesapla(donem);
                if (arac.prim>0){
                    System.out.println("------------------------");
                    System.out.println("Araç tipi: "+ arac.type);
                    System.out.println("Araç primi: "+ arac.prim);
                    System.out.println("Tarife dönemi: "+donemBilgi);
                    System.out.println("-----------------");
                    System.out.println("Yeni işlem için 1, çıkış için 0 yazınız.");
                    int select = input.nextInt();
                    isAgain = select == 1 ? true : false;
                }else{
                    System.out.println("Hesaplama işlemi başarısız tekrar deneyiniz");
                    System.out.println("Yeni işlem için 1, çıkış için 0 seçiniz.");
                    int select = input.nextInt();
                    isAgain = select == 1 ? true : false;
                }
                //prim=0 ise hatalı giriş yapmıştır.
                //prim>0 ise hesaplama işlemi başarılı diyebiliriz.
            }else{//Hatalı girişte
                System.out.println("Hatalı dönem girişi");
                isAgain = true;
            }

        } while (isAgain);
    }
}
