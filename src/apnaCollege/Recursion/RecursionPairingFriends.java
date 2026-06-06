package apnaCollege.Recursion;

import java.util.*;

// Find the number of ways in which you can invite n people to your, single or in pairs

public class RecursionPairingFriends {
    public static int waysOfFriendPairing(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }

        return waysOfFriendPairing(n-1) + (n-1)*waysOfFriendPairing(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of peoples ");
        System.out.println("The number of ways is " + waysOfFriendPairing(sc.nextInt()));
    }
}
