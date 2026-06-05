package apnaCollege;

import java.util.*;

/*
 Write 2 functions => decimalToBinary() & binaryToDecimal() to convert
a number from one number system to another. [BONUS]
 */

public class bitNumSysConverter {
    public static  int decimalToBinary(int deciNum) {
        int binNum = 0, base = 1;
        while (deciNum > 0) {
            binNum += (deciNum%2)*base;
            base *= 10;
            deciNum /= 2;
        }

        return binNum;
    }

    public static int binaryToDecimal(int binNum) {
        if (binNum < 0) {
           return -1;
        }

        int deciNum = 0, base = 1;

        while (binNum > 0) {
            if (binNum%10 != 0 && binNum%10 != 1) {
                return -1;
            }
            deciNum += (binNum%10)*base;
            base *= 2;
            binNum /= 10;
       }

        return deciNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number ");
        System.out.println("Binary conversion of given number is " + decimalToBinary(sc.nextInt()));

        System.out.println("Enter the binary number ");
        int result = binaryToDecimal(sc.nextInt());

        if (result == -1) {
            System.out.println("Invalid input");
        } else {
            System.out.println("Decimal conversion of given number is " + result);
        }
    }
}
