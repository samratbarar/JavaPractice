import java.util.Scanner;
public class conkmtmiles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Kilometer into miles Convertor ");
        System.out.println("Enter kilometers");
        double a = s.nextDouble();
        double b = a * 0.621371 ;
        System.out.println("Miles : " + b);
    }
}
