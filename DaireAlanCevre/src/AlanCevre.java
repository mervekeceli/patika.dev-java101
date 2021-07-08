import java.util.Scanner;

public class AlanCevre {
    public static void main(String[] args) {
        /*
        * Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        * Alan Formülü : π * r * r;
        * Çevre Formülü : 2 * π * r;
        *
        * Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        * 𝜋 sayısını = 3.14 alınız.
        * Formül : (𝜋 * (r*r) * 𝛼) / 360
        * */

        double a, alan, cevre, aMerkezAciliAlan, r , pi =3.14;

        Scanner input = new Scanner(System.in);

        System.out.printf("Yaricapi Giriniz: ");
        r = input.nextFloat();

        System.out.printf("Aciyi giriniz: ");
        a = input.nextDouble();

        cevre = 2 * pi * r;
        alan = pi * r * r;

        aMerkezAciliAlan = (pi *  (r * r) * a)/360;

        System.out.println("Cevre : "+ cevre);
        System.out.println("Alan: "+ alan);
        System.out.println("Merkez acisi "+a+" olan daire parcası alanı: "+aMerkezAciliAlan);

    }
}
