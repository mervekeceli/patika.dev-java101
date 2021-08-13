import java.util.Scanner;
public class AverageDivide {
    public static void main(String[] args) {
        int k, sum = 0, average = 0, counter = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        k = input.nextInt();

        for(int i = 0;i <= k; i++){
            if(i%3 == 0 && i%4 == 0){
                System.out.println(i);
                sum += i;
                counter++; // sayacı bir arttırdım
            }
        }

        average = sum / counter;
        System.out.println("Ortalama: "+average);
    }
}
