package loginpageapp;

public class LoginPageApp {


    /*

 Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, email ve şifre bilgileri alınız.
                             email ve şifre birer listede tutulur.
                             aynı email kabul edilmez. //unique

         giriş(login): email ve şifre girilir.
                       email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
*/


    //çok yakında, merakla beklemeyin, önce siz deneyin:)


    public static void main(String[] args) {
        //1-User'lar için bir class oluşturalım.
        //2-Userla ilgili işlemleri yapmak için bir UserService class'ı oluşturalım.
        //3)ad-soyad-şifre alıp listeye kaydedelim.
        //UserService service = new UserService(); //denemek için oluşturduk normalde bunun burda yeri yok.
        //service.register();
        UserService service = new UserService();

        service.register();

        service.login();








    }
}

