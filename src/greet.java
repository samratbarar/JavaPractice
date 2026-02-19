import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String a = sc.nextLine();
        System.out.println("Hello " + a +", Have a good day.");
    }
}
