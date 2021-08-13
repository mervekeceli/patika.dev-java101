import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        int number, number1, number2;
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
        for(int i = 0;i <= number; i++){
            number1 = (int) Math.pow(i,4);
            number2 = (int) Math.pow(i,5);
            System.out.println(i+" sayısının 4. kuvveti: "+number1+"\t5. kuvveti: "+number2);
        }
    }
}
