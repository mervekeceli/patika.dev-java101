import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        /*
        * Meyveler ve KG Fiyatları
        * Armut : 2,14 TL
        * Elma : 3,67 TL
        * Domates : 1,11 TL
        * Muz: 0,95 TL
        * Patlıcan : 5,00 TL
        * */

        Scanner input = new Scanner(System.in);

        double kg, armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamtutar = 0;
        System.out.print("Armut Kaç Kilo? ");
        kg = input.nextDouble();
        toplamtutar += kg * armut;

        System.out.print("Elma Kaç Kilo? ");
        kg = input.nextDouble();
        toplamtutar += kg * elma;

        System.out.print("Domates Kaç Kilo? ");
        kg = input.nextDouble();
        toplamtutar += kg * domates;

        System.out.print("Muz Kaç Kilo? ");
        kg = input.nextDouble();
        toplamtutar += kg * muz;

        System.out.print("Patlıcan Kaç Kilo? ");
        kg = input.nextDouble();
        toplamtutar += kg * patlican;

        System.out.println("Toplam Tutar: "+ toplamtutar);
    }
}
