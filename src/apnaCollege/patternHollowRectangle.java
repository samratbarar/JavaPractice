package apnaCollege;

import java.util.*;

public class patternHollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height and width of the pattern : ");
        int height = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 1 ; i <= height; i++) {
            for (int j = 1 ; j <= width ; j++) {
                if ((i == 1) || (j == 1) || (i == height) || (j == width)) {
                    System.out.print("*");
                } else { // yeh bich m space dene ke liye taki hollow ban sake
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
