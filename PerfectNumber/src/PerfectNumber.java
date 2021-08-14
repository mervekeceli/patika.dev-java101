import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int number, result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        for(int i = 1; i < number; i++)
        {
            if(number % i == 0) {
                result += i;
            }
        }

        if(result == number){
            System.out.print(number+" sayısı mükemmel sayıdır.");
        }
        else
            System.out.print(number+" sayısı mükemmel sayı değildir.");
    }
}
