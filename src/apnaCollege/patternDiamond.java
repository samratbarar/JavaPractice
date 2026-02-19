package apnaCollege;

import java.util.*;

public class patternDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the diamond : ");
        int height = sc.nextInt();

        if (height % 2 == 0) {
            // for upper half
            for (int i = 1; i <= height/2; i++) {
                // spaces
                for (int j = 1; j <= height/2 - i; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= 2*i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // for lower half
            for (int i = height/2; i > 0; i--) {
                // spaces
                for (int j = 1; j <= height/2 - i; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= 2*i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            // for upper half
            for (int i = 1; i <= height/2 + 1; i++) {
                // spaces
                for (int j = 1; j <= height/2 + 1 - i; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= 2*i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // for lower half
            for (int i = height/2; i > 0; i--) {
                // spaces
                for (int j = 1; j <= height/2 + 1 - i; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int j = 1; j <= 2*i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
