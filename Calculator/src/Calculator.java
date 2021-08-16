import java.util.Scanner;
public class Calculator {

    static void plus(){
        Scanner input = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ +". sayı: ");
            number = input.nextInt();

            if (number == 0)
                break;
            result += number;
        }
        System.out.println("Sonuc: "+result);
    }

    static void minus(){
        Scanner input = new Scanner(System.in);

        int number, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuc: "+result);
    }

    static void times(){
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){
            System.out.print(i++ + ". sayı: ");
            number = input.nextInt();

            if(number == 1)
                break;

            if (number == 0)
            {
                result = 0;
                break;
            }

            result *= number;
        }
        System.out.println("Sonuc: "+result);
    }

    static void divided(){
        Scanner input = new Scanner(System.in);
        double number, result = 1, counter;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı: ");
            number = input.nextInt();

            if(i != 1 && number == 0){
                System.out.println("sayıyı 0'a bölemezsiniz.");
                continue;
            }

            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuc: "+result);
    }

    static void power(){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base = input.nextInt();

        System.out.print("Üst değerini giriniz: ");
        int exponent = input.nextInt();
        int result = 1;

        for(int i = 1; i <=exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç: "+result);
    }

    static void factorial(){
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int number = input.nextInt();
        int result = 1;

        for (int i = number; i > 0; i--){
            result *= i;
        }
        System.out.println("Sonuç: "+result);
    }

    static void mode(){
        Scanner input = new Scanner(System.in);

        int number, result, section;

        System.out.print("Modu alınacak sayı: ");
        number = input.nextInt();

        System.out.print("mod değeri: ");
        section = input.nextInt();

        result = number % section;
        System.out.println("Sonuç: "+result);
    }

    static void area(){
        Scanner input = new Scanner(System.in);
        int bottomEdge, topEdge, result;

        System.out.print("Üst Kenarı giriniz: ");
        topEdge = input.nextInt();

        System.out.print("Alt kenarı giriniz: ");
        bottomEdge = input.nextInt();

        result = topEdge * bottomEdge;
        System.out.println("Alan: "+result);
    }

    static void environment(){
        Scanner input = new Scanner(System.in);
        int bottomEdge, topEdge, result;

        System.out.print("Üst Kenarı giriniz: ");
        topEdge = input.nextInt();

        System.out.print("Alt kenarı giriniz: ");
        bottomEdge = input.nextInt();

        result = 2 * (topEdge + bottomEdge);
        System.out.println("Çevre: "+result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    area();
                    environment();
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
