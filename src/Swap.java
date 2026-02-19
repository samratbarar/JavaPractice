import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("a : " );
        int a = s.nextInt();
        System.out.print("b : ");
        int b = s.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.print("e : " );
        double e = s.nextDouble();
        System.out.print("f : ");
        double f = s.nextDouble();
        e = e + f;
        f = e - f;
        e = e - f;
        System.out.println("e : " + e);
        System.out.println("f : " + f);
        System.out.print("c : " );
        double c = s.nextDouble();
        System.out.print("d : " );
        double d = s.nextDouble();
        if (c>d) {
            c = c / d;
            d = c * d;
            c = (1 / c) * d;
        }
         else {
             d=d/c;
             c=d*c;
             d=(1/d)*c;
        }
        System.out.println("c : " + c);
        System.out.println("d : " + d);
    }
}
