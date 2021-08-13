import java.util.Scanner;
public class Pow {
    public static void main(String[] args) {
        int number, pow, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        number = input.nextInt();

        System.out.print("Üst değeri: ");
        pow = input.nextInt();

        for(int i = 1; i <= pow;i++){
            result *=number;
        }
        System.out.println("Sonuç: "+result);
    }
}
