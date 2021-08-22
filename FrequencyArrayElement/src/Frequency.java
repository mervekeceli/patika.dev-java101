import java.util.Arrays;
public class Frequency {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void frequency(int[] array){
        int[] tempArray = new int[array.length];

        int startIndex = 0, counter = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++)
            {
                if((i != j) && (array[i] == array[j])){
                    if (!isFind(tempArray, array[i])) {
                        tempArray[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < tempArray.length; i++){
            for (int j = 0; j < array.length; j++){
                if(tempArray[i] != 0){
                    if(tempArray[i]==array[j])
                        counter++;
                }
            }
            if(tempArray[i] != 0)
               System.out.println(tempArray[i] + " elemanı " + counter + " kere tekrar edildi.");
            counter = 0;
        }
    }
}
