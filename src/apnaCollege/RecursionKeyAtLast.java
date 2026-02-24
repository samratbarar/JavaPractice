package apnaCollege;

import java.util.Scanner;

public class RecursionKeyAtLast {
    public static void KeyAtLast(int count, String key, String str, int index, String newStr) {
        if (index == str.length()) {
            if (count == str.length()) {
                System.out.println("The required string is " + newStr);
                return;
            }
            newStr += key.charAt(0);
            count++;
            KeyAtLast(count, key, str,index, newStr);
            return;
        }
        if (str.charAt(index) != key.charAt(0)) {
            newStr += str.charAt(index);
            count++;
        }
        KeyAtLast(count, key, str,index+1, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("Enter the character");
        String key = sc.nextLine();

        KeyAtLast(0, key, str, 0, "");
    }
}
// perfect solution
/*
import java.util.Scanner;

public class RecursionKeyAtLast {

    public static String KeyAtLast(String str, char key) {

        if (str.length() == 0) {
            return "";
        }

        char currChar = str.charAt(0);
        String remainingStr = KeyAtLast(str.substring(1), key);

        if (currChar == key) {
            return remainingStr + currChar;
        } else {
            return currChar + remainingStr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println("Enter the character");
        char key = sc.next().charAt(0);

        System.out.println("The required string is " + KeyAtLast(str, key));
    }
}
 */