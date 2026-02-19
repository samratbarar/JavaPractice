package apnaCollege;

import java.util.*;

/*
Write a function that calculates the Greatest Common Divisor of 2 numbers.
 */

public class functionGCD {
    public static int GCD(int n1, int n2) {
        int gcd = 1;
        if (n1 > n2) {
            for (int i = 2; i <= n1/2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 2; i <= n2/2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("The greatest common dividor of two numbers is " + GCD(num1,num2));
    }
}
// apnaCollege ka solution approach mere dimag m nhi aai thi yeh wali
/*
import java.util.*;

public class Solutions {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();

       while(n1 != n2) {
           if(n1>n2) {
               n1 = n1 - n2;
           } else {
               n2 = n2 - n1;
           }
       }
       System.out.println("GCD is : "+ n2);
   }
}
 */
