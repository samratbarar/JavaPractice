package apnaCollege;

import java.util.*;

public class functionAddTwoNumbers {
    public static int Sum(int a, int b) {
        return (a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers : ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();

        System.out.println("The Sum of the two numbers is : " + Sum(n1,n2));
    }
}
