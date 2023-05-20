public class AddTwoMatrix {

    public static void printMatrix(int matrix[][]) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matrix2[][] = {{9,8,7},{6,5,4},{3,2,1}};

        int sumMatrix[][] = new int[matrix1.length][matrix1.length];

        for(int i=0;i<sumMatrix.length;i++) {
            for(int j=0;j<sumMatrix[0].length;j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printMatrix(sumMatrix);


    }
}