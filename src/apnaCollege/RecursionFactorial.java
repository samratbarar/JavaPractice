package apnaCollege;

import java.util.Scanner;

public class RecursionFactorial {
    public static int Fact(int n){
        if (n == 0) {
            return 1;
        }
        return n * Fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("The factorial of given number is " + Fact(num));
    }
}
