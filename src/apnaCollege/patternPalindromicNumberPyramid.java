package apnaCollege;

import java.util.Scanner;

public class patternPalindromicNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the pyramid : ");
        int height = sc.nextInt();

        for (int i =1; i <= height; i++) {
            // for spaces height-i
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            // for palindromic number printing

            // for decreasing numbers
            for (int j = i; j > 0; j--) {
                if (j < 10) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            // for increasing numbers
            for (int j = 2; j <= i; j++) {
                if (j < 10) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
