package apnaCollege;

import java.util.*;

/*
Input an email from the user. You have to create a username from the email
by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
 */

public class stringDeletingPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = sc.nextLine();

        int index = email.indexOf('@');
        String userName = email.substring(0,index);

        System.out.println("Your username is " + userName);
    }
}
