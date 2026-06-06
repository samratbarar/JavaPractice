package apnaCollege.Recursion;

import java.util.Scanner;

// count the number of paths of reaching n-1,m-1 from 0,0 only moving right and downwards

public class RecursionCountPathMaze {
    public static int countPathMaze(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n-1 && j == m-1) {
            return 1;
        }

        return countPathMaze(i+1, j, n, m) + countPathMaze(i, j+1, n, m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows and columns : ");
        int rows = sc.nextInt(), cols = sc.nextInt();


        System.out.println("The number of paths is " + countPathMaze(0, 0, rows, cols));
    }
}
