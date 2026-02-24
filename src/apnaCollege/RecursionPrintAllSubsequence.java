package apnaCollege;

import java.util.Scanner;

public class RecursionPrintAllSubsequence {
    public static void PrintSubsequence(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        PrintSubsequence(str, idx+1, newStr + str.charAt(idx));
        PrintSubsequence(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        PrintSubsequence(str, 0, "");
    }
}
