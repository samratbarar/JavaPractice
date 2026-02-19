package apnaCollege;

import java.util.Scanner;

public class patternHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the pattern : ");
        int height = sc.nextInt();

        // half pyramid with star printing
        for (int i = 1 ; i <= height; i++) {
            for (int j = 1 ; j <=i  ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // half pyramid with numbers
        for (int i = 1 ; i <= height; i++) {
            for (int j = 1 ; j <=i  ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
