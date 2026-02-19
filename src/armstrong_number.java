import java.util.*;
public class armstrong_number {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();

        int n = number;
        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        int sum = 0;
        n = number;

        while (n>0) {
            int rem = n % 10;
            sum += Math.pow(rem,count);
            n = n/10;
        }

        if (sum==number) {
            System.out.println("Given number is armstrong number ");
        }
        else {
            System.out.println("Given number is not armstrong number ");
        }
    }
}
