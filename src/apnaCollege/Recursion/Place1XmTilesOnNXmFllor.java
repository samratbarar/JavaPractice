package apnaCollege.Recursion;

import java.util.*;

// Place tiles of size 1Xm on the floor of size nXm tell number of ways of placing tiles

public class Place1XmTilesOnNXmFllor {
    public static int numOfPlacements(int n, int m) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return numOfPlacements(n-m, m) + numOfPlacements(n-1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of floor nXm hence value of n and m ");

        System.out.println("The numbers of ways is " + numOfPlacements(sc.nextInt(), sc.nextInt()));
    }
}
