public class addition_of_matrix {
    public static void main(String[] args) {
        int [][] matrix1 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] matrix2 = {
                {1,2,3},
                {4,5,6}
        };
        int [][] matrixR = {
                {0,0,0},
                {0,0,0}
        };
        for (int i = 0;i<matrix1.length;i++) {
            for (int j = 0;j<matrix1[i].length;j++) {
                matrixR[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrixR[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
//help li hai