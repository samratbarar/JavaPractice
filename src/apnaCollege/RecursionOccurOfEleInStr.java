package apnaCollege;

import java.util.*;

public class RecursionOccurOfEleInStr {
    public static void Occurance(int first, int sec, int l, String str, String key) {
        if (l == str.length()-1) {
            System.out.println("The first and last occurance indexes are " + first + " and " + sec);
            return;
        }
        if (str.charAt(l) == key.charAt(0) && first == -1) {
            first = l;
        }
        if (str.charAt(l) == key.charAt(0)) {
            sec = l;
        }
        Occurance(first, sec, l+1, str, key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String and searching character");
        String str = sc.nextLine();
        String key = sc.next();

        Occurance(-1, -1, 0, str, key);
    }
}
