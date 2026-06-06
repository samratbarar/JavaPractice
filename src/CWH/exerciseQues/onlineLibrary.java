package CWH.exerciseQues;

import java.util.*;

/*
You have to implement a library using Java Class Library
Methods: addBook, issueBook, returnBook, showAvailableBooks
Properties: Array to store the available books
, array to store the issued books
 */

class library {
    int capacity;
    int noOfAvailBook;
    String[] availBook;
    int noOfIssueBook;
    String[] issueBook;

    public library(int capacity) {
        this.capacity = capacity;
        availBook = new String[capacity];
        issueBook = new String[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean setIssueBook(String issueBook) {
        if (noOfIssueBook == capacity) {
            System.out.println("Book issuing capcity is full");
            return false;
        }
        this.issueBook[noOfIssueBook] = issueBook;
        noOfIssueBook++;
        return true;
    }

    public boolean addBook(String bookName) {
        if (noOfAvailBook == capacity) {
            System.out.println("Book storing capcity is full");
            return false;
        }
        availBook[noOfAvailBook] = bookName;
        noOfAvailBook++;
        return true;
    }

    public void issuesBooks(String bookName) {
        boolean isBookAvail = false;
        for (int k = 0; k < noOfAvailBook; k++) {
            if (availBook[k].equals(bookName)) {
                isBookAvail = true;
                break;
            }
        }

        if (capacity == noOfIssueBook) {
            System.out.println("capacity is full ");
            return;
        }
        if (isBookAvail) {
            issueBook[noOfIssueBook] = bookName;
            for (int i = 0; i < noOfAvailBook; i++) {
                if (availBook[i].equals(bookName)) {
                    for (int j = i; j < noOfAvailBook-1; j++) {
                        availBook[j] = availBook[j+1];
                    }
                    break;
                }
            }
            availBook[noOfAvailBook-1] = null;
            noOfAvailBook--;
            noOfIssueBook++;
        } else {
            System.out.println("book is not available");
        }
    }

    public void showAvailableBooks() {
        System.out.println("List of available books are as follows ");
        for (int i = 0; i < noOfAvailBook; i++) {
            System.out.println(availBook[i] + ",");
        }
        System.out.print("Ended");
    }

    public void returnBook(String bookName) {
        boolean isIssuedBook = false;
        for (int k = 0; k < noOfIssueBook; k++) {
            if (issueBook[k].equals(bookName)) {
                isIssuedBook = true;
                break;
            }
        }
        if (isIssuedBook) {
            if (capacity == noOfAvailBook) {
                System.out.println("capacity is full");
                return;
            }
            availBook[noOfAvailBook] = bookName;
            for (int i = 0; i < noOfIssueBook; i++) {
                if (issueBook[i].equals(bookName)) {
                    for (int j = i; j < noOfIssueBook-1; j++) {
                        issueBook[j] = issueBook[j+1];
                    }
                    break;
                }
            }
            issueBook[noOfIssueBook-1] = null;
            noOfAvailBook++;
            noOfIssueBook--;
        } else {
            System.out.println("Invalid book return");
        }
    }

    public void showIssuedBooks() {
        System.out.println("The list of Issued books are as follows ");
        for (int i = 0; i < noOfIssueBook; i++) {
            System.out.print(issueBook[i] + ",");
        }
        System.out.print("Ended");
    }
}

public class onlineLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of library of storing books");
        library l = new library(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the available books and Writing -1stop to end the inputting");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop")) {
                break;
            }
            if (!l.addBook(bookName)) {
                break;
            }
        }

        System.out.println("Enter the issued books and Writing -1stop to end the inputting");
        while (true) {
            String bookName = sc.nextLine();
            if (bookName.equals("-1stop")) {
                break;
            }
            if (!l.setIssueBook(bookName)) {
                break;
            }
        }
    }
}
