import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a, b, c, u, cevre;

        Scanner input = new Scanner(System.in);

        System.out.printf("A kenarını giriniz: ");
        a = input.nextInt();

        System.out.printf("B kenarını giriniz: ");
        b = input.nextInt();

        System.out.printf("C kenarını giriniz: ");
        c = input.nextInt();

        cevre = (a + b + c);
        u = cevre / 2;

        double alan;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin 1. kenarı: " + a +"\nÜçgenin ikinzi kenarı: "+ b +"\nÜçgenin 3. kenarı: " + c);
        System.out.println("Cevre: "+ cevre);
        System.out.println("Alan: "+ alan);

    }
}
