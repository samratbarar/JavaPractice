package apnaCollege;

import java.util.*;

public class functionPrintTable {
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + n*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        printTable(num);
    }
}
