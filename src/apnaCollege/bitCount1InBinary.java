package apnaCollege;

import java.util.*;

/*
 Write a program to count the number of 1’s in a binary representation
of the number.
 */

public class bitCount1InBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        int count = 0;
        for (int i=0; i<binary.length(); i++) {
            if ((num & (1<<i)) > 0) {
                count++;
            }
        }
        // better and clear approach not mine
        /*
         while (num > 0) {
            count += (num & 1); // check last bit
            num = num >> 1;     // right shift
        }
         */
        System.out.println("The number of 1’s in a binary representation of the number is " + count);
    }
}
