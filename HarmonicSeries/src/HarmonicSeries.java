import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        int number;
        double result = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        while (number > 0) {

            result = result + (double)1 / number;
            number--;
            System.out.print(result + ", ");
        }
    }
}
