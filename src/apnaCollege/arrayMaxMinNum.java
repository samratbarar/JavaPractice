package apnaCollege;

import java.util.Scanner;

/*
Find the maximum & minimum number in an array of integers.
 */

import java.util.Scanner;

public class arrayMaxMinNum {
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

        // finding maximum and minimum num in array
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // printing max and min value
        System.out.printf("The maximum and minimum are %d and %d respectively",max ,min);
    }
}
