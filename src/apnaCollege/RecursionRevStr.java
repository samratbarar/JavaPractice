package apnaCollege;

import java.util.*;

/*
Print string in reverse
 */

public class RecursionRevStr {
    public static void RevStr(int i, String str) {
        if (i == 0) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        RevStr(i-1, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();

        RevStr(str.length()-1, str);
    }
}
