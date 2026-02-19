package apnaCollege;

import java.util.*;

/*
 Input a string from the user. Create a new string called ‘result’ in which you
will replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */

public class stringReplace {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();

//        String result = "";
// mam logic
//        for (int i=0; i<str.length(); i++) {
//            if (str.charAt(i) == 'e') {
//                result += 'i';
//            }else {
//                result += str.charAt(i);
//            }
//        }

        // direct
        String result = str.replace('e' , 'i');

        System.out.println(result);
    }
}
