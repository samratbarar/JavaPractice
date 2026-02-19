import java.util.Scanner;
public class percentagecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        float a = sc.nextFloat();
        System.out.println("Enter your marks");
        float b = sc.nextFloat();
        System.out.println("Enter your marks");
        float c = sc.nextFloat();
        System.out.println("Enter your marks");
        float d = sc.nextFloat();
        System.out.println("Enter your marks");
        float e = sc.nextFloat();
        float per = ( ( a + b + c + d + e ) / 500 ) * 100 ;
        System.out.println(per);
    }
}
