package apnaCollege.array;

import java.util.*;

// not completely my code with little help of approach but maximum efforts is mine
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
        System.out.println("Enter the matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int rowStart = 0, rowEnd = rows - 1, columnStart = 0, columnEnd = columns - 1, i;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (i = columnStart; i <= columnEnd; i++) {
                System.out.print(matrix[rowStart][i] + ",");
            }

            rowStart++;

            for (i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][columnEnd] + ",");
            }

            columnEnd--;

            for (i = columnEnd; i >= columnStart; i--) {
                System.out.print(matrix[rowEnd][i] + ",");
            }

            rowEnd--;

            for (i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][columnStart] + ",");
            }

            columnStart++;
        }
    }
}
