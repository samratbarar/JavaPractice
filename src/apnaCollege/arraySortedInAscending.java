package apnaCollege;

/*
Take an array of numbers as input and check if it is an array sorted in ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
       {3, 4, 6, 2} is not sorted in ascending order.

 */

import java.util.Scanner;

public class arraySortedInAscending {
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

        // checking sorted in ascending or not
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }

        // printing result
        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }
}
