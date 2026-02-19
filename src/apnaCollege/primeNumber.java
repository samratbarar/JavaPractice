package apnaCollege;

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 0) {
            System.out.println("Invalid number");
        } else if (num == 0 || num == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("The Number is a prime number");
        } else {
            System.out.println("The Number is not a prime number");
        }
    }
}
