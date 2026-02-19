import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to get its Factorial : " );
        long n = s.nextLong();
        long f = 1;
        for (long i =1;i<=n;i++){
            f = f*i;
        }
        System.out.println("The Factorial of entered number is : " + f);

    }
}
