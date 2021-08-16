import java.util.Scanner;
public class PrimeNumber {

    static boolean isPrimeNumber(int number, int i){
        if (number < 2) {
            return true;
        }
        if (i == (number / 2)) {
            return true;
        } else if (number % i == 0) {
            return false;
        } else {
            return isPrimeNumber(number, i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı: ");
        int number = input.nextInt();

        System.out.print(isPrimeNumber(number,2) == true? number + " Asal sayıdır. " : number + " Asal sayı değildir.");
    }
}
