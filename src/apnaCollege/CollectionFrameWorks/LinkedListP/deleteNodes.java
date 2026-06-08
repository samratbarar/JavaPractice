package apnaCollege.CollectionFrameWorks.LinkedListP;

import java.util.*;

// Take elements(numbers in the range of 1-50) of a Linked List as input
// from the user. Delete all nodes which have values greater than 25.

public class deleteNodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Enter the number of elements");
        int num = sc.nextInt();

        System.out.println("Enter the element between 1 to 50");
        for (int i = 1; i <= num; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
                i--;
            }
        }
    }
}
