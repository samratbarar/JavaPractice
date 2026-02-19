import java.util.Scanner;
public class abc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        float a = s.nextFloat();
        System.out.println("Enter Second Number : ");
        float b = s.nextFloat();
        System.out.println("Enter Third Number : ");
        float c = s.nextFloat();
        float sum = a + b + c ;
        System.out.print("The sum of these three numbers is : " + sum );
    }
}
