package apnaCollege;

import java.util.Scanner;

public class RecursionKeypadCombination {
    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void KeypadComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        for (int i = 0; i < keypad[str.charAt(idx) - '0'].length(); i++) {
            KeypadComb(str, idx+1, combination + keypad[str.charAt(idx) - '0'].charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        KeypadComb(str, 0, "");
    }
}
