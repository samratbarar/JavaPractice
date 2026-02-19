import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your income in lakhs :");
        double a = s.nextDouble();
        double b = (0.2*(a-5)) + (0.05*(a-2.5)) - (0.05*(a-5));
        //my mistake vaise mistake nhi but isko short likh sakte hai seedha b = 0.2*(a-5) + 0.05*2.5
        double c = (0.2*(a-5)) + (0.05*(a-2.5)) - (0.05*(a-5)) - (0.2*(a-10)) + (0.3*(a-10));
        //same upar wale ki tarah
        if (a > 0 && a <= 2.5) {
            System.out.println("You have no tax on your income ");
        }
        else if (a > 2.5 && a<=5.0) {
            System.out.println("Your tax(in lakhs) is :" + 5*(a-2.5)/100);
        }
        else if (a>5.0 && a<=10.0) {
            System.out.println("Your tax(in lakhs) is :" + b);
        }
        else {
            System.out.println("Your tax(in lakhs) is :" + c);
        }
    }
}
