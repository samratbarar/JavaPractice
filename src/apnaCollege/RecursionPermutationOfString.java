package apnaCollege;

import java.util.Scanner;

public class RecursionPermutationOfString {
    public static void PrintPermutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            PrintPermutations(str.substring(0, i) + str.substring(i+1), perm + str.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String str = sc.nextLine();

        PrintPermutations(str, "");
    }
}
