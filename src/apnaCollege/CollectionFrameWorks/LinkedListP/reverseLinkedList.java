package apnaCollege.CollectionFrameWorks.LinkedListP;

import java.util.*;

import apnaCollege.CollectionFrameWorks.LL;
import apnaCollege.CollectionFrameWorks.LinkedListsLL;

// To reverse a linked list conditions space complexity O(1) and time O(n)
// Do not use any other linked list and keep one transverse

public class reverseLinkedList {
    public static LL.Node reverseLinkedList(LL.Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        LL.Node newHead = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();

        System.out.println("Enter the number of elements");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the element");
        for (int i = 0; i < num; i++) {
            list.addAtLast(sc.nextLine());
        }

        if (list.head == null || list.head.next == null) {
            return;
        }

//        LL.Node prev = list.head;
//        LL.Node curr = list.head.next;

        LL.Node prev = null;
        LL.Node curr = list.head;

        while (curr != null) {
            LL.Node nextOne = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextOne;
        }

        //list.head.next = null;
        list.head = prev;

        list.printList();

        list.head = reverseLinkedList(list.head);
        list.printList();
    }
}
/* this will work but have time complexity of O(n^2)
        for (int i = 0; i < list.size()/2; i++) {
            if (list.size()-1-i < 0) {
                break;
            }
            int temp1 = list.get(i);
            int temp2 = list.get(list.size()-1-i);
            list.set(i, temp2);
            list.set(list.size()-1-i, temp1);
        }
         */