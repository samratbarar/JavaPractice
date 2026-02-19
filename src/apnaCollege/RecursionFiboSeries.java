package apnaCollege;

import java.util.Scanner;

public class RecursionFiboSeries {
    public static void printFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        printFibo(b, a+b, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms");
        int num = sc.nextInt();

        printFibo(0, 1, num);
        System.out.println("Finished");
    }
}
