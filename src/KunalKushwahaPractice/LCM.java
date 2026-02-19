package KunalKushwahaPractice;

import  java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        int LCM = 1;

        for (int i = 2; n1 != 1 || n2 != 1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                LCM *= i;
                n1 /= i;
                n2 /= i;
                i--;
            } else if (n1 % i == 0) {
                LCM *= i;
                n1 /= i;
                i--;
            } else if (n2 % i == 0) {
                LCM *= i;
                n2 /= i;
                i--;
            }
        }

        System.out.println("The LCM of given numbers is " + LCM);
    }
}
/*
ya phele gcd nikal ke fir
LCM = (A*B) / GCD(A<B) formula se nikal lenge
 */
