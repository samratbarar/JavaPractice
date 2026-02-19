package apnaCollege;

import java.util.Scanner;

public class patternInvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the pattern : ");
        int height = sc.nextInt();

        // inverted half pyramid
        for (int i = 1 ; i <= height; i++) { // int i = height; i> 0;i--
            for (int j = i ; j <= height ; j++) { // int j = i; j > 0; j-- or int j = 1; i <= i ; j++
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted half pyramid 180 rotated
        for (int i = 1 ; i <= height ; i++) {
            // for spaces
            for (int j = i ; j < height  ; j++) { // int j = 1 ; j <= height-i ; j++
                System.out.print(" ");
            }

            // for pattern printing
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }

            // for new line
            System.out.println();
        }

        // inverted half pyramid with numbers
        for (int i = 1 ; i <= height; i++) {
            for (int j = 1 ; j <= height-i+1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
