package apnaCollege;

import java.util.*;

/*
 Write a program to enter the numbers till the user wants and at the end it
should display the count of positive, negative and zeros entered.
 */

public class typeOfNumCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 1, pCount = 0, nCount = 0, zeroCount = 0;

        do {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num > 0) {
                pCount++;
            } else if (num < 0) {
                nCount++;
            } else {
                zeroCount++;
            }
            System.out.println("Do you want to continue\nIf yes then enter 1 and for no enter 0");
            choice = sc.nextInt();
        }  while (choice == 1);

        System.out.printf("The count of positive, negative and zeros entered are %d, %d and %d respectively", pCount, nCount, zeroCount);
    }
}
