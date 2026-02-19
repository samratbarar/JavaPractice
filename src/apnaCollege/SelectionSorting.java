package apnaCollege;

import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array ");
        int size = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter the elments of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
              if(arr[j] < arr[smallest]) {
                  smallest = j;
              }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
