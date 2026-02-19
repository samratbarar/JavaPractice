package apnaCollege;

import java.util.*;

/*
Write a function that takes in age as input and returns if that person is eligible
to vote or not. A person of age > 18 is eligible to vote.
 */

public class functionVoteEligibleChecker {
    public static boolean voteEligibility(short age) {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        short age = sc.nextShort();

        if (voteEligibility(age)) {
            System.out.println("You are eligible for voting");
        } else {
            System.out.println("You are eligible for voting");
        }
    }
}
