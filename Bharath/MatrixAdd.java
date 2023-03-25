public class MatrixAdd {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 0}, {3, 4}};
        int[][] matrix2 = {{1, 6}, {7, 9}};
        int[][] sumMatrix = new int[2][2];

        // adding matrices
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // displaying sum matrix
        System.out.println("Sum of matrices:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}