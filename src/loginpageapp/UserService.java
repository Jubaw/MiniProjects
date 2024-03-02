package loginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);
    List<String> emails = new ArrayList<>();

    List<String> passwords = new ArrayList<>();

    //3)ad-soyad-şifre alıp listeye kaydedelim.

    public void register() {

        System.out.println("Lütfen Ad-Soyad giriniz");
        String name = scanner.nextLine();
        //4-Email geçersizse tekrar girmeli.
        String email;
        boolean isValid;
        do {
            System.out.println("Lütfen email giriniz");
            email = scanner.nextLine();
            isValid = validateEmail(email);
            if (emails.contains(email)) {
                System.out.println("Bu email zaten kayıtlı.Başka bir email deneyin.");
                isValid = false;
            } else {
                isValid = true;
            }
        } while (!isValid);


        //5) password oluşturalım ÖDEV
        String password;
        boolean isValidPassword;


        do {
            System.out.println("Lütfen şifre oluşturun");
            password = scanner.nextLine();
            isValidPassword = validatePassword(password);
        } while (!isValidPassword);


        // 6) User oluşturmak
        User user = new User(name, email, password);
        emails.add(user.getEmail());
        passwords.add(user.getPassword());
        System.out.println("Tebrikler, kayıt işlemi başarılı.");
        System.out.println("Email ve şifreniz ile sisteme giriş yapabilirsiniz.");

    }

    public boolean validatePassword(String password) {

        if (password.length() < 6) {
            System.out.println("Parola en az 6 haneden oluşmalıdır.");
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("Parola en az 1 küçük harf içermelidir");
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Parola en az 1 büyük harf içermelidir.");
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            System.out.println("Parola en az bir rakam içermelidir");
            return false;
        }
        if (!password.matches(".*[^a-zA-Z0-9]")) {
            System.out.println("Parola en az bir sembol içermelidir.");
            return false;
        }
        return true;
    }


    public void login() {
        System.out.println("Lütfen emailinizi girin");
        String email = scanner.nextLine();

        boolean isExistEmail = emails.contains(email);


        if (isExistEmail) {
            //Kullanıcının kaydı vardır, şifreni kontrol edelim.
            int sayac = 3;
            while (sayac > 0) {
                System.out.println("Şifrenizi girin");
                String password = scanner.nextLine();
                //şifre ile email aynı indextemi ?
                int index = emails.indexOf(email);

                if (passwords.get(index).equals(password)) {
                    System.out.println("Giriş başarılı.");
                    break;
                } else {
                    sayac--;
                    System.out.println("Hatalı şifre, kalan deneme hakkınız: " + sayac);
                }
            }
        } else { //Kullanıcıdan kaydı yoktur yazısı
            System.out.println("Sisteme kayıtlı bir kullanıcı bulunamadı");
        }
    }

    private boolean validateEmail(String email) {
        boolean space = email.contains(" ");
        boolean containsAt = email.contains("@");
        if (space) {
            System.out.println("Email boşluk içeremez.");
            return false;
        } else if (!containsAt) {
            System.out.println("Email @ içermeli.");
            return false;
        } else {
            String[] parts = email.split("@");
            if (parts.length != 2) {
                System.out.println("Geçersiz email formatı.");
                return false;
            }
            String firstPart = parts[0];
            String secondPart = parts[1];
            // Check for invalid characters in the first part
            if (!firstPart.matches("[a-zA-Z0-9-._]+")) {
                System.out.println("Email rakam,harf ve -._ dışında karakter içeremez.");
                return false;
            }
            // Basic domain check
            if (!(secondPart.equals("gmail.com") || secondPart.equals("hotmail.com") || secondPart.equals("yahoo.com"))) {
                System.out.println("Emailde; Gmail, Hotmail ya da Yahoo dışında alan adı kullanılamaz.");
                return false;
            }
            return true;
        }
    }
}


