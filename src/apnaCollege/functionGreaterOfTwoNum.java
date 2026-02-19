package apnaCollege;

import java.util.*;

/*
Write a function which takes in 2 numbers and returns the greater of those
two.
 */

public class functionGreaterOfTwoNum {
    public static int greaterOfTwoNum(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("The Greater number is " + greaterOfTwoNum(num1, num2));
    }
}
