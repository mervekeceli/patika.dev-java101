import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul
        // eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        int number, sum = 0;
        boolean askOddNumber = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz: ");
            number = input.nextInt();

            if(number%2 == 0 || number %4 == 0){
                System.out.println("Girilen Sayi : "+number);
                sum +=number;
                System.out.println("Toplam: "+sum);
            }
            else{
                System.out.println("Girilen sayı tek ve sayi :"+number);
                askOddNumber = false;
            }
        }while(askOddNumber);
    }
}
