package apnaCollege;

import java.util.*;

/*
 Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s
marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)
 */

public class conditionalMenuDrivenProgramOfMarksChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.print("Enter your marks(out of 100) : ");
            int marks = sc.nextInt();

            if (marks >= 90) {
                System.out.println("This is good");
            } else if (marks < 90 && marks >= 60) {
                System.out.println("This is also good");
            } else if (marks < 60 && marks >= 0) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid marks");
            }

            System.out.println("Do you want to continue\nIf yes then enter 1 and for no enter 0");
            choice = sc.nextInt();
        } while(choice == 1);
    }
}
