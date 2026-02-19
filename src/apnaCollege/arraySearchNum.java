package apnaCollege;

import java.util.*;

/*
take an array as input from the user and
Search for a given number x and
print the index at which it occurs
 */

public class arraySearchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputting size of array
        System.out.println("Enter the number of elements of the array");
        int size = sc.nextInt();

        // defining array
        int[] arr = new int[size];

        // inputting array
        for (int i = 0; i < size; i++) {
            System.out.printf("arr[%d] = ",i);
            arr[i] = sc.nextInt();
        }

        // inputting number which has to search
        System.out.println("Enter the number x which you want to search in arr");
        int x = sc.nextInt();

        // searching num in array and printing index
        boolean notFound = true;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                System.out.printf("Element occur at %d index in the entered array\n",i);
                notFound = false;
            }
        }
        if (notFound) {
            System.out.println("The number x is not present in array ");
        }
    }
}
