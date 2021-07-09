import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select, number1, number2;
        System.out.print("Birinci sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
        System.out.print("Seciminizi giriniz: ");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: "+(number1 + number2));
                break;
            case 2:
                System.out.println("Fark: "+(number1 - number2));
                break;
            case 3:
                System.out.println("Çarpım: "+(number1 * number2));
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("Sayı 0'a bölünemez.");
                }else
                    System.out.println("Bölüm: "+ (double)(number1 / number2));
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
                break;
        }
    }
}
