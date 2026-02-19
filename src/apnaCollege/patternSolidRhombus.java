package apnaCollege;

import java.util.*;

public class patternSolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the rhombus : ");
        int height = sc.nextInt();

        for (int i =1; i <= height; i++) {
            // for spaces height-i
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // for star printing
            for (int j =1; j <= height; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
