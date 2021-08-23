public class MatrixTranspose {
    static void tranpose(int[][] matrix){
        int[][] tempArray = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                tempArray[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matris: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose: ");
        for (int j = 0; j < tempArray.length; j++){
            for (int i = 0; i < tempArray[j].length; i++){
                System.out.print(tempArray[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {700,600,650},
                {900,800,700},
                {300,400,350},
                {500,450,470},
                {600,500,480}};

        tranpose(matrix);
    }
}
