package apnaCollege;

import java.util.*;

public class patternPascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the triangle : ");
        int height = sc.nextInt();

        for (int i = 0; i < height; i++) {
            // spaces
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }

            // numbers printing
            // bekar hai but mera logic hai
            for (int j = 0; j <= i; j++) {
                int factI = 1, factJ = 1, factIJ= 1; // calculating factorial
                for (int k = 2; k <= i; k++) {
                    factI *= k;
                    if (k <= j) {
                        factJ *= k;
                    }
                    if (k <= i - j) {
                        factIJ *= k;
                    }
                }
                System.out.print(factI / (factJ*factIJ) + " "); 
            }
            System.out.println();
        }
    }
}
