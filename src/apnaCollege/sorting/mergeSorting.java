package apnaCollege.sorting;

import java.util.*;

// Use divide and conquer technique

public class mergeSorting {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int[] mergeArr = new int[ei - si + 1];
        int idx1 = si, idx2 = mid+1, count = 0;

        while(idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                mergeArr[count++] = arr[idx1++];
            } else {
                mergeArr[count++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            mergeArr[count++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            mergeArr[count++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < mergeArr.length; i++, j++) {
            arr[j] = mergeArr[i];
        }
    }
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
