import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if(userName.equals("mervekeceli") && password.equals("12345678")) {
            System.out.println("Sisteme başarı ile giriş yaptınız.");
        }
        else{
            System.out.println("Şifreniz Yanlış :(\nŞifrenizi sıfırlamak ister miziniz?(e/y)");
            select = input.nextLine();
            switch (select) {
                case "e":
                    System.out.print("Yeni Şifrenizi Giriniz:");
                    newPassword = input.nextLine();
                    if (password.equals(newPassword)) {
                        password = newPassword;
                        System.out.println("Şifreniz oluşturuldu.");
                    } else {
                        System.out.println("Şifreniz sıfırlanamadı.\nUnuttuğunuz şifre ile yeni şifreniz aynı olmamalı.\nLütfen başka şifre giriniz.");
                    }
                    break;
                case "y":
                    System.out.println("Eski şifreniz hala geçerli.");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + select);
            }
        }
    }
}
