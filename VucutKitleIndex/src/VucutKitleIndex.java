import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        /*
        *Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        *Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        * Kilo (kg) / Boy(m) * Boy(m)
        *  */


        float boy, kilo, vIndex;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = input.nextFloat();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextFloat();

        vIndex = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndexiniz: "+ vIndex);
    }
}
