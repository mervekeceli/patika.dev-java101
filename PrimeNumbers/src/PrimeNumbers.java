public class PrimeNumbers {
    public static void main(String[] args) {
        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        int number = 1, counter = 0;
         while (number<100){
             for (int i = 1; i <= number;i++){
                 if(number%i==0)
                     counter++;
             }

             if(counter == 2){
                 System.out.print(number+" ");
             }
             counter = 0;
             number++;
         }
    }
}
