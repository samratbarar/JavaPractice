package apnaCollege;

import java.util.*;

/*
Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings.
 */

public class stringCumalativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int size = sc.nextInt();

        String[] arr = new String[size+1];
        int totalLength = 0;

        System.out.println("Enter Strings ");
        for (int i=0; i<=size; i++) {
            arr[i] = sc.nextLine();
            totalLength += arr[i].length();
        }

        System.out.println("The Total Length of the array of strings : " + totalLength);
    }
}
