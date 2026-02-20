package apnaCollege;

import java.util.*;

public class RecursionIsArraySorted {

    public static void InputArr(int n, int[] arr) {
        Scanner sc = new Scanner(System.in);
        if (n == arr.length-1) {
            System.out.printf("Enter arr[%d] = ",n);
            arr[n] = sc.nextInt();
            return;
        }
        System.out.printf("Enter arr[%d] = ",n);
        arr[n] = sc.nextInt();

        InputArr(n+1,arr);
    }

    public static boolean IsSorted(int[] arr, int n) {
        if (n == arr.length-1) {
            return true;
        }
        if (arr[n] > arr[n+1]) {
            return false;
        }

        return IsSorted(arr, n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of elements in array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements of array");
        InputArr(0, arr);

        if (IsSorted(arr, 0)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
