package apnaCollege.CollectionFrameWorks.LinkedListP;

import java.util.LinkedList;
import java.util.Scanner;

// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3).
// Search for the number 7 & display its index.

public class searchInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the numer of elements");
        int num = sc.nextInt();

        System.out.println("Enter the element");
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Enter the searching element");
        int key = sc.nextInt();
        int index = 0;

        for (Integer ele: list) {
            if (ele == key) {
                System.out.println("The index of searching element is " + index);
                return;
            }
            index++;
        }

        System.out.println("Given element is not present in list ");
    }
}