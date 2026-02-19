package apnaCollege;

import java.util.Scanner;

public class pattern01Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height of the pattern : ");
        int height = sc.nextInt();

        for (int i = 1 ; i <= height; i++) {
            for (int j = 1 ; j <=i  ; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
