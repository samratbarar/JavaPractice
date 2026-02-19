package apnaCollege;

import java.util.*;

/*
Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]
 */

public class array2DSpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        int rows = sc.nextInt(), columns = sc.nextInt();

        // defining 2D array
        int[][] matrix = new int[rows][columns];

        // input matrix
        System.out.println("The transpose is ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

    }
}
