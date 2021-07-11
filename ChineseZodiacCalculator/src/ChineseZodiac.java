import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        int year,zodiac;
        String cZodiac = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        zodiac = year % 12;

        switch (zodiac){
            case 0:
                cZodiac = "Maymun";
                break;
            case 1:
                cZodiac = "Horoz";
                break;
            case 2:
                cZodiac = "Köpek";
                break;
            case 3:
                cZodiac = "Domuz";
                break;
            case 4:
                cZodiac = "Fare";
                break;
            case 5:
                cZodiac = "Öküz";
                break;
            case 6:
                cZodiac = "Kaplan";
                break;
            case 7:
                cZodiac = "Tavşan";
                break;
            case 8:
                cZodiac = "Ejderha";
                break;
            case 9:
                cZodiac = "Yılan";
                break;
            case 10:
                cZodiac = "At";
                break;
            case 11:
                cZodiac = "Koyun";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: "+cZodiac);
    }
}
