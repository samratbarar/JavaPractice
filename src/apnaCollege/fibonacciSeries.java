package apnaCollege;

import java.util.*;

/*
Write a program to print Fibonacci series of n terms where n is input
by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that
came before it.
 */

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <=n; i++) {
            System.out.print(firstTerm + "\t");
            int temp = secondTerm;
            secondTerm = firstTerm + secondTerm;
            firstTerm = temp;
        }
    }
}
