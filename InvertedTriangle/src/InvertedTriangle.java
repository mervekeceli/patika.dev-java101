import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        int numCounter,star;
        String space = " ";
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        numCounter = input.nextInt();

        star = 2 * numCounter +1;
        for(int i = 0;i < numCounter;i++){
            for (int k = 1;k< i + 1; k++) {
                System.out.print(" ");
            }
            for (int j=1; j< (star - 1);j++){
                System.out.print("*");
            }
            star -=2;
            System.out.println(" ");
        }
    }
}
