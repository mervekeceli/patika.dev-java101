import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        boolean isError = false;
        String horoscope = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Input month :");;
        month = input.nextInt();


        if ( month >= 1 && month <= 12) {

            System.out.print("Input day :");;
            day = input.nextInt();

            if (month == 1) {
                if (day >= 1 && day <= 31) {
                    if (day < 22)
                        horoscope = "Capricorn";
                    else
                        horoscope = "Aquarius";
                } else
                    isError = true;
            } else if (month == 2) {
                if (day >= 1 && day <= 28) {
                    if (day > 20)
                        horoscope = "Aquarius";
                    else
                        horoscope = "Pisces";
                } else
                    isError = true;
            } else if (month == 3) {
                if (day >= 1 && day <= 31) {
                    if (day < 21)
                        horoscope = "Pisces";
                    else
                        horoscope = "Aries";
                } else
                    isError = true;
            } else if (month == 4) {
                if (day >= 1 && day <= 30) {
                    if (day < 21)
                        horoscope = "Aries";
                    else
                        horoscope = "Taurus";
                } else
                    isError = true;
            } else if (month == 5) {
                if (day >= 1 && day <= 31) {
                    if (day < 22)
                        horoscope = "Taurus";
                    else
                        horoscope = "Gemini";
                } else
                    isError = true;
            } else if (month == 6) {
                if (day >= 1 && day <= 30) {
                    if (day < 23)
                        horoscope = "Gemini";
                    else
                        horoscope = "Cancer";
                } else
                    isError = true;
            } else if (month == 7) {
                if (day >= 1 && day <= 31) {
                    if (day < 23)
                        horoscope = "Cancer";
                    else
                        horoscope = "Leo";
                } else
                    isError = true;
            } else if (month == 8) {
                if (day >= 1 && day <= 31) {
                    if (day < 23)
                        horoscope = "Leo";
                    else
                        horoscope = "Virgo";
                } else
                    isError = true;
            } else if (month == 9) {
                if (day >= 1 && day <= 30) {
                    if (day < 23)
                        horoscope = "Virgo";
                    else
                        horoscope = "Libra";
                } else
                    isError = true;
            } else if (month == 10) {
                if (day >= 1 && day <= 31) {
                    if (day < 23)
                        horoscope = "Libra";
                    else
                        horoscope = "Scorpio";
                } else
                    isError = true;
            } else if (month == 11) {
                if (day >= 1 && day <= 30) {
                    if (day < 22)
                        horoscope = "Scorpio";
                    else
                        horoscope = "Sagittarius";
                } else
                    isError = true;
            } else if (month == 12) {
                if (day >= 1 && day <= 31) {
                    if (day < 22)
                        horoscope = "Sagittarius";
                    else
                        horoscope = "Capricorn";
                } else
                    isError = true;
            }

        }else
            System.out.println("You did wrong input, please input a valid value ");

        if (isError)
            System.out.println("Invalid input!!!");
        else
            System.out.println("Your horoscope : " + horoscope);

    }
}
