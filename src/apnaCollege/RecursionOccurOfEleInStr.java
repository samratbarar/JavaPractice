package apnaCollege;

import java.util.*;

/*
find the index of first and last of any character in string using recursion
 */

public class RecursionOccurOfEleInStr {
    public static int first = -1;
    public static int sec = -1;
    public static void Occurance(int l, String str, String key) {
        if (l == str.length()) {
            System.out.println("The first and last occurance indexes are " + first + " and " + sec);
            return;
        }
        if (str.charAt(l) == key.charAt(0) && first == -1) {
            first = l;
        }
        if (str.charAt(l) == key.charAt(0)) {
            sec = l;
        }
        Occurance(l+1, str, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String and searching character");
        String str = sc.nextLine();
        String key = sc.next();

        Occurance(0, str, key);
    }
}
