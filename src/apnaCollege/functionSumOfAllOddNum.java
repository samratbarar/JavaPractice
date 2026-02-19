package apnaCollege;

import java.util.*;

/*
 Write a function to print the sum of all odd numbers from 1 to n.
 */

public class functionSumOfAllOddNum {
    public static void printSumOfAllOddNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of all odd numbers till n is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number upto which sum of odd number is required");
        int n = sc.nextInt();

        printSumOfAllOddNum(n);
    }
}
