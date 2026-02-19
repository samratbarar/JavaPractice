package apnaCollege;

import java.util.*;

/*
Enter 3 numbers from the user & make a function to print their average.
 */

public class functionAverageOfThreeNum {
    public static void printAverage(float n1,float ...arr) {
            for (int i = 0; i < arr.length; i++) {
                n1 += arr[i];
            }

            n1 = n1 / (arr.length + 1);

            System.out.println("The Average is " + n1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        float num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        printAverage(num1, num2, num3);
    }
}
