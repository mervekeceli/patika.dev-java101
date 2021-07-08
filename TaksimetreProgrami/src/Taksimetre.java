import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        /*
         * Taksimetre KM başına 2.20 TL tutmaktadır.
         * Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
         *Taksimetre açılış ücreti 10 TL'dir.
         * */

        double km, tutar = 10, kmBirimTutar = 2.20;

        Scanner input = new Scanner(System.in);
        System.out.printf("Gidilen mesafe kaç kilometredir: ");
        km = input.nextDouble();

        tutar += (km/1000) * kmBirimTutar;

        //tutar 20 liradan küçük olduğunda 20 lira ödeme yapması gerekir.
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println("Taksimetre Ucreti: " + tutar);
    }


}
