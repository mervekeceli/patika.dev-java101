import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        int n, starNum;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= (2 * i + 1);k++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        starNum = 2 * n + 1;
        for(int i = n + 2;i <= (2 * n + 1);i++){

            for(int k = 1;k<(i - n);k++){
                System.out.print(" ");
            }
            for (int j = 1;j<(starNum-1);j++){
                System.out.print("*");
            }
            starNum -=2;
            System.out.println(" ");
        }

    }
}
