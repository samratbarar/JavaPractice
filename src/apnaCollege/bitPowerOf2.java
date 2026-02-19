package apnaCollege;

import java.util.*;

/*
Write a program to find if a number is a power of 2 or not.
 */

public class bitPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        int count = 0;
        for (int i=0; i<binary.length(); i++) {
            int bitmask = 1 << i;
            int bit = num & bitmask;
            if (bit > 0) {
                count++;
            }
            if (count > 1) {
                System.out.println("Entered number is not power 0f 2");
                break;
            }
        }
        if (count == 1) {
            System.out.println("Entered number is power 0f 2");
        }

        // my logic is correct but not optimised
        // optimised logic is
        /*
        if (num > 0 && (num & (num-1) == 0)) {
        System.out.println("Entered number is power 0f 2");
        }else {
        System.out.println("Entered number is not power 0f 2");
        }
         */
    }
}
