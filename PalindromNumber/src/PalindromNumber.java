public class PalindromNumber {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, mod;

        while(temp != 0){
            mod = temp % 10;
            reverseNumber = (reverseNumber * 10) + mod;
            temp /= 10;
        }
        return reverseNumber == number;
    }

    public static void main(String[] args) {
        System.out.print(isPalindrom(121));
    }
}
