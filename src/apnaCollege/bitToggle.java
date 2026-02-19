package apnaCollege;

import java.util.*;

/*
Write a program to toggle a bit a position = “pos” in a number “n”.
 */

public class bitToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("Enter position of bit ");
        int pos = sc.nextInt();

        int bitmask = 1 << pos;
        System.out.println("Result after toggling = " + (bitmask^num));
    }
}
