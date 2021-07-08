import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvTutar, kdvliTutar, kdvOran;

        Scanner input = new Scanner(System.in);
        System.out.printf("Ürünün Tutarını Giriniz: ");
        tutar = input.nextDouble();

        // tutar 1000 tl den büyük olduğunda kdv tutarı 0.8 oluyor.
        kdvOran = (tutar > 1000) ? 0.8 : 0.18;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Ürünün tutarı: "+ tutar);
        System.out.println("Ürünün kdv oranı: "+ kdvOran);
        System.out.println("kdv tutarı: "+ kdvTutar);
        System.out.println("KDV'li Tutarı: "+ kdvliTutar);
    }
}
