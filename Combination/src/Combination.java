import java.util.Scanner;
public class Combination {

    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }

    public static void main(String[] args) {
        int n, r, combination;
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner input = new Scanner(System.in);
        System.out.print("N değerini giriniz: ");
        n = input.nextInt();

        System.out.print("R değerini giriniz: ");
        r = input.nextInt();

        combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("C("+n+", "+r+"): "+combination);
    }
}
