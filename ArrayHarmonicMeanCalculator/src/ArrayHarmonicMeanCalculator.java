public class ArrayHarmonicMeanCalculator {
    static double average(int [] array){
        double sum = 0.0, average = 0.0;
        int n = array.length;
        for (int i = 0; i < n ; i++){
            sum += (double) 1/array[i];
        }
        average = n / sum;
        return average;
    }
}
