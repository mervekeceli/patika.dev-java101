import com.sun.source.tree.BindingPatternTree;

import java.util.Scanner;
public class Activity {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);

        /*
        * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        * */

        System.out.print("Sıcaklık Değerini Giriniz: ");
        heat = input.nextInt();

        if(heat < 5)
            System.out.println("Kayağa gidebilrisin.");
        else if(5 < heat && 25 > heat){
            if(15 >= heat)
                System.out.println("Sinemaya gidebilirsiniz.");

            if(15 <= heat)
                System.out.println("Piknik yapmaya gidebilirsiniz. ");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
