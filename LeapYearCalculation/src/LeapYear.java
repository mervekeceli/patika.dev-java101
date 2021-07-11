import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı Giriniz: ");
        year = input.nextInt();

        if(year%4==0){
            System.out.println(year+" artık yıldır!");
        }
        else
            System.out.println(year+" artık yıl değildir!");
    }
}
