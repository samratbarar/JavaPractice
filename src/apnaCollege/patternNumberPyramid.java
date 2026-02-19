package apnaCollege;

import java.util.*;

public class patternNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the pyramid : ");
        int height = sc.nextInt();

        for (int i =1; i <= height; i++) {
            // for spaces height-i
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }

            // for number printing
            for (int j =1; j <= 2*i - 1; j++) { // j <= i
                if (j % 2 == 0) {
                    System.out.print("  ");     // sout(i + " ")
                } else {
                    if (i < 10) { // for making perfect pyramid for value greater than 9 and less than 100
                        System.out.print(i + " ");
                    } else {
                        System.out.print(i);
                    }
                }
            }

            System.out.println();
        }
    }
}
