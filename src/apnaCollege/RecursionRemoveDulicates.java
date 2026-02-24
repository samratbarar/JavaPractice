package apnaCollege;

import java.util.Scanner;

public class RecursionRemoveDulicates {
    public static void RemoveDulicate(int idx, String str, String newStr) {
       if (idx == str.length()) {
           System.out.println("Reduced String is " + newStr);
           return;
       }
       int IsPresent = newStr.indexOf(str.charAt(idx));
       if (IsPresent < 0) {
           newStr += str.charAt(idx);
       }
       RemoveDulicate(idx+1, str, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        RemoveDulicate(0, str, "");
    }
}
/*
    public static void RemoveDulicate(int idx, String str, String newStr) {
        if (idx == str.length()-1) {
            newStr += str.charAt(str.length()-1);
            System.out.println("Reduced String is " + newStr);
            return;
        }
        if (str.charAt(idx) == str.charAt(idx+1)) {
            if (idx != str.length()-2){
                newStr += str.charAt(idx);
                idx++;
            }
        } else {
            newStr += str.charAt(idx);
        }
        RemoveDulicate(idx+1, str, newStr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        RemoveDulicate(0, str, "");
    }
 */
