package apnaCollege;

import java.util.Scanner;

public class patternHollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the butterfly : ");
        int height = sc.nextInt();

        if (height % 2 == 0) { // for even height
            // for the upper half of butterfly
            for (int i = 1; i <= height/2; i++) {
                // for starting stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // for spaces
                for (int j = 1; j <= height - 2*i; j++) {
                    System.out.print(" ");
                }

                // for ending stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // for the lower half of butterfly
            for (int i = height/2; i > 0; i--) {
                // for starting stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // for spaces
                for (int j = 1; j <= height - 2*i; j++) {
                    System.out.print(" ");
                }

                // for ending stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {  // for odd height
            // for the upper half of butterfly
            for (int i = 1; i <= height/2 +1; i++) {
                // for starting stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // for spaces
                for (int j = 1; j <= height - 2*i +1 ; j++) {
                    System.out.print(" ");
                }

                // for ending stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            // for the lower half of butterfly
            for (int i = height/2; i > 0; i--) {
                // for starting stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                // for spaces
                for (int j = 1; j <= height - 2*i +1; j++) {
                    System.out.print(" ");
                }

                // for ending stars
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
