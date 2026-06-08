package apnaCollege.CollectionFrameWorks;

import java.util.Scanner;

class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
            size++;
        }
    }

    // add at first
    public void addAtFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add at last
    public void addAtLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    // delete first element
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // delete last element
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node lastNode = head.next;
        Node secLastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secLastNode = secLastNode.next;
        }

        secLastNode.next = null;
    }

    public void delete(String ele) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            if (head.data.equals(ele)) {
                deleteFirst();
                return;
            }
            System.out.println("Given element is already not in list");
            return;
        }

        if(head.data.equals(ele)) {
            deleteFirst();
            return;
        }

        Node currNode = head.next;
        Node prevNode = head;

        while (currNode != null) {
            if (currNode.data.equals(ele)) {
                prevNode.next = currNode.next;
                size--;
                return;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }

        System.out.println("Given element is already not in list");
    }

    public int getSize() {
        return size;
    }
}

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