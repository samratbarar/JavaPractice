package apnaCollege;

import java.util.*;

/*
 For a given matrix of N x M, print its transpose.
 */

public class arrayTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        int n = sc.nextInt(), m = sc.nextInt();

        // defining 2D array
        int[][] matrix = new int[n][m];

        // input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // printing transpose

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
