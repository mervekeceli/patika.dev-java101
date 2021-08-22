public class ArrayRepeatValue {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2,3,89,7,5,9,2,3,3,89};
        int[] tempArray = new int[array.length];

        int startIndex = 0;

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

        for (int value : tempArray)
            if(value != 0)
                System.out.print(value + " ");
    }
}
