public class CreatingLetterB {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++){
            for (int j = 0; j < 4; j++){
                if(j == 0 || j == 3)
                    System.out.print("* ");
                else if(i == 0 || i == 3 || i ==6)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
