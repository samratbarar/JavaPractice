import java.util.Scanner;

public class writeexpression {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Enter the value of v :");
        float v = w.nextFloat();
        System.out.println("Enter the value of u :");
        float u = w.nextFloat();
        System.out.println("Enter the value of a :");
        float a = w.nextFloat();
        System.out.println("Enter the value of s :");
        float s = w.nextFloat();
        float ex = ( v*v - u*u ) / ( 2 * a * s );
        System.out.println(ex);
    }
}
