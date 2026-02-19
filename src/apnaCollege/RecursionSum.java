package apnaCollege;

import java.util.*;

public class RecursionSum {
    public static int Sum(int n){
        if (n == 0) {
            return 0;
        }
        return n + Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        System.out.println("The sum upto given number is " + Sum(num));
    }
}
