import java.util.Scanner;
public class PassTheLesson {
    public static void main(String[] args) {
        /*
        * Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.
        * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        * Geçme Notu : 55
        * */
        int matematik, fizik, turkce, kimya, muzik, toplam = 0, ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        if(matematik>=0 && matematik <= 100)
            toplam +=matematik;

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        if(fizik >= 0 && fizik <= 100)
            toplam+=fizik;


        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        if(turkce >= 0 && turkce <=100)
            toplam += turkce;


        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        if(kimya >=0 && kimya <=100)
            toplam += kimya;


        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if(muzik >= 0 && muzik <=100)
            toplam +=muzik;


        ortalama = toplam / 5;
        if(ortalama > 55)
        {
            System.out.println("Tebrikler. Dönemi geçtiniz.\nOrtalamanız: "+ortalama);
        }
        else {
            System.out.println("Seneye tekrar görüşürüz. Çünkü kaldınız.\nOrtalamanız: "+ortalama);
        }
    }
}
