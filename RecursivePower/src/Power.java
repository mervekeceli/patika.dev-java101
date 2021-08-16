import java.util.Scanner;
public class Power {

    static int power(int base, int exp){
        int result = 1;

        if(exp == 0)
            return 1;

        return result = base * power(base, exp -1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exp;

        System.out.print("Taban değerini giriniz: ");
        base = input.nextInt();

        System.out.print("Üst değerini giriniz: ");
        exp = input.nextInt();


        System.out.print("Sonuç: "+power(base,exp));
    }
}
