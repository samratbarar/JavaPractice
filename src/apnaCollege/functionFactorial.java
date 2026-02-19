package apnaCollege;

import java.util.Scanner;

public class functionFactorial {
    public static void factorial(int n) {
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println("The Factorial is : " + fact);
        } else if (n < 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println("The Factorial is : " + fact);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        factorial(n);
    }
}
