import java.util.Scanner;
public class SumNumberDigits {
    public static void main(String[] args) {
        int number, numberValue = 0, sum = 0, temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = input.nextInt();

        temp = number;
        while (temp !=0){
            numberValue = temp%10;
            sum += numberValue;

            temp/=10;
        }
        System.out.print(number+" Sayısının basamak değerleri toplamı: "+sum);
    }
}
