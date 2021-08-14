import java.util.Scanner;
public class MinMaxNumbers {
    public static void main(String[] args) {
        int counter, min, max;

        int []  array = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        counter = input.nextInt();

        for (int i = 0; i < counter;i++){
            System.out.print((i + 1)+". sayıyı giriniz: ");
            array[i] = input.nextInt();
        }

        min = array[0];
        max =array[0];
        for (int i =1; i<counter ;i++){
            if(array[i] < min){
                min = array[i];
            }

            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.print("Max: "+max+"\nMin: "+min);
    }
}
