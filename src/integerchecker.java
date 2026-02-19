import java.util.Scanner;

public class integerchecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your integer : ");
        boolean a = s.hasNextInt();
        System.out.println(a);
    }
}
