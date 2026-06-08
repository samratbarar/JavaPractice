package apnaCollege.CollectionFrameWorks;

import java.util.Scanner;

public class LinkedListsLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();

        // list.addAtFirst("Barar");
        // list.addAtFirst("Samrat");
        //  list.addAtLast("Boy");

        System.out.println("Enter list and to stop entering just type -0null and press enter");
        while (true) {
            String input = sc.nextLine();

            if (input.equals("-0null")) {
                break;
            }

            list.addAtLast(input);
        }

        list.printList();

        list.deleteLast();
        list.deleteFirst();
        list.delete("yathu");
        list.printList();

        System.out.println("The size of list is " + list.getSize());
    }
}