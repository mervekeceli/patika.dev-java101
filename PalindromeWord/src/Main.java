import java.util.Scanner;
public class Main {

    public static boolean palindromeWord(String word){
        String tempWord = "";

        for (int i = word.length() - 1; i > -1; i--) {
            tempWord += word.charAt(i);
        }
        return word.equals(tempWord);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String str = input.nextLine();

        if(palindromeWord(str))
            System.out.println(str + " Palindrom kelime.");
        else
            System.out.println(str + " Palindrom kelimde değil !");
    }
}
