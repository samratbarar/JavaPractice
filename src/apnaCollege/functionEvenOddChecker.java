package apnaCollege;

import java.util.*;

public class functionEvenOddChecker {
    public static void EvenOddChecker(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
        } else if (n % 2 == 0) {
            System.out.println("The Given number is even ");
        } else {
            System.out.println("The Given number is odd ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        EvenOddChecker(num);
    }
}
