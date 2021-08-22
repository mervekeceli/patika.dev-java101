import java.util.Arrays;
public class ArrayMinMaxValue {

    static void minMax(int[] array, int value){
        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < array.length ; i++)
            tempArray[i] = array[i];

        tempArray[array.length] = value;
        Arrays.sort(tempArray);

        System.out.println(Arrays.toString(tempArray));

        for (int i = 0; i < tempArray.length; i++){
            if(tempArray[i]== value){
                System.out.println("Min değeri: "+ tempArray[i - 1] + "\nMax Değeri: " + tempArray[i + 1]);
            }
        }
    }
}
