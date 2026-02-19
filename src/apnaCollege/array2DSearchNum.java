package apnaCollege;

import java.util.*;

/*
take a 2D array as input from the user
search for a given number x and
print the indices at which it occurs
 */

public class array2DSearchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");
        int rows = sc.nextInt(), columns = sc.nextInt();

        // defining 2D array
        int[][] matrix = new int[rows][columns];

        // input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // inputting num
        System.out.println("Enter the number x which you want to search in matrix");
        int x = sc.nextInt();

        // searching the x
        boolean notFound = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] == x) {
                    System.out.println("The indices are i = " + i + " j = " + j);
                    notFound = false;
                }
            }
        }

        // checking element is found or not
        if (notFound) {
            System.out.println("The number x is not found in matrix");
        }
    }
}
