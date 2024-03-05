package carinsuranceapp;

import java.util.Scanner;

public class Car {
    /*
          Tarife dönemi: Aralık 2024, Haziran 2024
          1.Dönem: Haziran 2024                 2.Dönem Aralık 2024
          otomobil: 2000                        otomobil: 2500
          kamyon: 3000                          kamyon: 3500
          otobüs tip1: 4000 tip2:5000           otobüs tip1: 4500 otobüs tip2: 5500
          motosiklet: 1500                      motosiklet: 1750
     */

    public String type; //otobüs otomobil motoksiklet kamyon
    public int prim;// tarife dönemine göre prim
    //5.Primi hesaplama yapıcaz.


    public void primHesapla(int donem) {
        //tipine göre hesaplama
        switch (this.type) {
            case "otomobil":
                this.prim = donem == 1 ? 2000 : 2500; //dönem 1 ise prime 2000 atanıyor, değilse 2500.
                break;
            case "kamyon":
                this.prim = donem == 1 ? 3000 : 3500;
                break;
            case "otobüs":
                primHesaplaOtobus(donem);
                break;
            case "motosiklet":
                this.prim = donem == 1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatalı giriş");
                this.prim = 0;
                break;
        }

    }

    public void primHesaplaOtobus(int donem) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Otobüs tipini seçiniz");
        System.out.println("1.Tip : 18 - 30 koltuk sayısı");
        System.out.println("2.Tip : 31 ve üstü koltuk sayısı");
        int otobüs = scan.nextInt();
        switch (otobüs) {
            case 1:
                this.prim = donem == 1 ? 4000 : 4500;
                break;
            case 2:
                this.prim = donem == 1 ? 4500 : 5500;
                break;
            default:
                System.out.println("Hatalı giriş");
                this.prim = 0;
                break;

        }

    }
}
