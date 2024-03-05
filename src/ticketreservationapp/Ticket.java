package ticketreservationapp;

public class Ticket {

    //4- Mesafe(km),koltuk no,fiyat bilgisi,yolculuk tipi(gidiş-dönüş)
    public double distance;
    public int typeNo;
    public String seatNo;
    public double price;

    //5- Bilet fiyatı hesaplayalım;
    public void getTotalPrice(int age) {
        int seat = Integer.parseInt(this.seatNo);
        double total = 0;
        switch (this.typeNo) {
            case 1: //tek yön
                if (seat % 3 == 0) {
                    total = this.distance * 1.2;
                }else{
                    total *= 1;
                }
                System.out.println("Toplam tutar: "+total);
                break;

            case 2: //çift yön
                if (seat % 3 == 0){
                    total = this.distance*2.4;
                }else{
                    total *= 2;
                }
                System.out.println("Toplam tutar: "+total);
                //çift yön indirimi
                total *= 0.8; //%20 indirim
                break;
        }//son tutardan yaş indirimi
        if (age<= 12){
            total *= 0.5; //%50 indirim
            System.out.println("12 Yaş altı indirimli toplam tutar: "+total);
        }else if (age>=65){
            total *= 0.7; //%30 indirim.
            System.out.println("65 yaş üzeri indirimli toplam tutar: "+total);
        }
        this.price = total;

    }
    //6- Bileti yazdıralım

    public void printTicket(Bus otobus){
        System.out.println("********************");
        System.out.println("---Bilet Detayı---");
        System.out.println("Otobüs plakası: "+otobus.plateNumber);
        System.out.println("Mesafe: "+this.distance);
        System.out.println("Yolculuk tipi: "+(this.typeNo == 1 ? "Gidiş" : "Gidiş - Dönüş"));
        System.out.println("Koltuk no: "+this.seatNo);
        System.out.println("Toplam tutar: "+ this.price);
        System.out.println("Keyifli yolculuklar dileriz.");
    }


}
