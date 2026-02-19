package apnaCollege;

import java.util.*;

public class functionPrime {
    public static void primeChecker(int n) {
        boolean isPrime = true;

        if (n == 1 || n == 0) {
            isPrime = false;
        } else if (n < 0) {
            System.out.println("Invalid number");
        } else {
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The given number is prime");
        } else {
            System.out.println("The given number is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        primeChecker(num);
    }
}
