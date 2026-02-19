import java.util.Scanner;
public class intarraychecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the integer to check in array : ");
        int n = s.nextInt();
        int[] i = {4, 5, 6, 7, 8, 9};
        boolean r = false;
        for (int element:i){
            if (n==element) {
                r = true;
                break;
            }
        }
        if (r){
            System.out.println("Yes,\n This integer belongs to array");
        }
        else {
            System.out.println("No,\n This integer is not belongs to array");
        }

        //below is working fine but native and above is not my code, but I am close to that approach
//        if (n == i[0] || n == i[1] || n == i[2] || n == i[3] || n == i[4] || n == i[5]) {
//            System.out.println("Yes, \n This integer belongs to array");
//        } else {
//            System.out.println("No, \n This integer is not belongs to array");
//        }


        //below is working properly
//        for (int element:i) {
//            if (n == element) {
//                System.out.println("Yes, \n This integer belongs to array");
//                break;
//            }
//            else {
//                System.out.println("No, \n This integer is not belongs to array");
//            }
//        }
    }
}

