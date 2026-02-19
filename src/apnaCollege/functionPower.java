package apnaCollege;

import java.util.*;

/*
Two numbers are entered by the user, x and n. Write a function to find
the value of one number raised to the power of another i.e. x ki power n
 */

public class functionPower {
    public static float power(int x, int n) {
        if (n > 0) {
            int pow = 1;
            for (int i = 1; i <= n; i++) {
                pow *= x;
            }
            return pow;
        } else if (n == 0) {
            return 1;
        } else {
            float pow = 1;
            for (int i = n; i < 0; i++) {
                pow *= 1 / (float)x;
            }
            return pow;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x and n");
        int x = sc.nextInt(), n = sc.nextInt();

        if (x == 0 && n == 0) {
            System.out.println("Indeterminant form ");
        } else if (n < 0 && x == 0) {
            System.out.println("Its infinte");
        } else {
            System.out.println("The x raised to the power n is " + power(x,n));
        }
    }
}
