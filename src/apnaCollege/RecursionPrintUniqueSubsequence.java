package apnaCollege;

import java.util.HashSet;
import java.util.Scanner;

public class RecursionPrintUniqueSubsequence {
    public static void PrintUniqueSubsequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
//            if (set.contains(newStr)) {
//                return;
//            } else {
//                System.out.println(newStr);
//                set.add(newStr);
//                return;
//            }
            if (set.add(newStr)) {
                System.out.println(newStr);
            }
            return;
        }
        PrintUniqueSubsequence(str, idx+1, newStr + str.charAt(idx), set);
        PrintUniqueSubsequence(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter a String");
        String str = sc.nextLine();

        PrintUniqueSubsequence(str, 0, "", set);
    }
}
