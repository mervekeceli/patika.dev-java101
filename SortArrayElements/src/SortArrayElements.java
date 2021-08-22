import java.util.Scanner;
import java.util.Arrays;
public class SortArrayElements {
    public static void sort(){
        int counter, value = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        counter = input.nextInt();

        int[] array = new int[counter];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < counter; i++){
            System.out.print( (i + 1) + ". Elemanı: ");
            value = input.nextInt();
            array[i] = value;
        }

        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
    }
}
