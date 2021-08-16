import java.util.Scanner;
public class Power {

    static int power(int base, int exp){
        int result = 1;

        if(exp == 0)
            return 1;

        return result = base * power(base, exp -1);
    }

    public static void main(String[] args) {
        System.out.print("Sonuç: "+power(7,3));
    }
}
