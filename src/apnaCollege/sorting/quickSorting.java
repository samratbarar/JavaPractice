package apnaCollege.sorting;

import java.util.*;

// using pivot and partition :--> set last element as pivot and start comparing from index 0 storing it as low
// and storing n-1 index as high and an index i = -1 to store element using swap in such as smaller than pivot placing
// before pivot and larger after pivot and sort them accordingly

public class quickSorting {
    public static int partition(int[] arr, int low, int high) {
        int i = low-1;
        int pivot = arr[high];

        for (int j = low; j < high; j++){
            if (pivot > arr[j]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int piIdx = partition(arr, low, high);

            quickSort(arr, low, piIdx-1);
            quickSort(arr, piIdx+1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
