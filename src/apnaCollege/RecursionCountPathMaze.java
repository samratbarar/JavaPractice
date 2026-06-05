package apnaCollege;

import java.util.Scanner;

public class RecursionCountPathMaze {
    public static void countPathMaze(int row, int col, int trackR, int trackD) {
        if (trackR == col-1 || trackD == row-1) {
            return;
        }
        System.out.printf("Move from (%d,%d) to (%d,%d)\n",trackD,trackR,trackD,trackR+1);
        countPathMaze(row, col, trackR+1, trackD);
        System.out.printf("Move from (%d,%d) to (%d,%d)\n",trackD,trackR+1,trackD+1,trackR+1);
        countPathMaze(row, col, trackR, trackD+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of rows and columns : ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        countPathMaze(rows, cols, 0, 0);
    }
}
