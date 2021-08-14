import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        String userName, password;
        int balance = 1500, select, right =3;

        Scanner input = new Scanner(System.in);

        while (right > 0){
            System.out.print("Kullanıcı Adınız: ");
            userName = input.nextLine();

            System.out.print("Şifreniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.print("Merhaba Kodluyoruz Bankasına Hoşgeldiniz.\n");

                do {
                    System.out.print("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış Yap\n");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırılacak tutarı giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                            int price1 = input.nextInt();

                            if(price1 > balance){
                                System.out.print("Bankanızda böyle bir bakiye yok. İşleminizi gerçekleştiremiyoruz.");
                            }
                            else{
                                balance -=price1;
                            }
                            break;
                        case 3:
                            System.out.print("Bakiyeniz: "+balance);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + select);
                    }
                }while (select !=4);
            }
            else
            {
                right--;
                System.out.print("Hatalı kullanıcı adı veya şifre.\nTekrar deneyiniz.");

                if(right == 0){
                    System.out.print("Hesanınız bloke olmuştur. Bankanız ile iletişime geçiniz.");
                }
                else
                    System.out.println("Kalan giriş hakkınız: "+right);
            }
        }
    }
}
