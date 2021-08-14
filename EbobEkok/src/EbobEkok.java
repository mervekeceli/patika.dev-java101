import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 , number2, ebob = 1, i = 2, ekok;

        System.out.print("Birinci sayıyı giriniz: ");
        number1 =input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        while (i <= number1){
            if(number1%i == 0 && number2%i == 0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: "+ebob);

        //EKOK = (n1*n2) / EBOB

        ekok = (number1 * number2) / ebob;
        System.out.println("Ekok: "+ekok);

    }
}
