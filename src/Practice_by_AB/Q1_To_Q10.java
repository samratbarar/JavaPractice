package Practice_by_AB;
import java.util.Scanner;
public class Q1_To_Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        // Question 1 and 2
        int a = 1;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        int c = a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

        System.out.println(a);
        System.out.println(b);
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        // Question 3
        int num = 77;
        System.out.println("Decimal " + num);
        System.out.println("Octal " + Integer.toOctalString(num));
        System.out.println("Hexadecimal " + Integer.toHexString(num));
        System.out.println("Binary " + Integer.toBinaryString(num));
        // Question 4
        System.out.println("Enter your input and at the end write stop to know your number of inputs : ");
        int i;
        for (i = 0; i>=0;i++){
            String input = scan.next();
            if (input.equalsIgnoreCase("stop")){
                break;
            }
        }
        System.out.println(i);
        // Question 5
        System.out.println("Enter the first Numbers : ");
        boolean in1 = scan.hasNextInt();
        if (in1) {
            int in2 = scan.nextInt();
            System.out.println("Enter the second Numbers : ");
            boolean in3 = scan.hasNextInt();
            if (in3) {
                int in4 = scan.nextInt();
                int in5 = in4 + in2;
                int in6 = in2 - in4;
                int in7 = in2 / in4;
                int in8 = in2 * in4;
                System.out.println("The sum of Two Numbers is : " + in5);
                System.out.println("The subraction of Two Numbers is : " + in6);
                System.out.println("The division of Two Numbers is : " + in7);
                System.out.println("The multiplication of Two Numbers is : " + in8);
            }
            else {
                double dou2 = scan.nextDouble();
                double dou3 = in2 + dou2;
                double dou6 = in2 - dou2;
                double dou8 = in2 / dou2;
                double dou9 = in2 * dou2;
                System.out.println("The sum of Two Numbers is : " + dou3);
                System.out.println("The subraction of Two Numbers is : " + dou6);
                System.out.println("The division of Two Numbers is : " + dou8);
                System.out.println("The multiplication of Two Numbers is : " + dou9);
            }
        }
        else {
            System.out.println("Enter the second Numbers : ");
            double dou1 = scan.nextDouble();
            double dou4 = scan.nextDouble();
            double dou5 = dou1 + dou4;
            double dou7 = dou1 - dou4;
            double dou10 = dou1 / dou4;
            double dou11 = dou1 * dou4;
            System.out.println("The sum of Two Numbers is : " + dou5);
            System.out.println("The subraction of Two Numbers is : " + dou7);
            System.out.println("The division of Two Numbers is : " + dou10);
            System.out.println("The multiplication of Two Numbers is : " + dou11);
        }

         */
        // Question 6
        /*
        System.out.println("Enter the value of Temperature in degree fahrenheit to convert it in degree celsius");
        double F = scan.nextDouble();
        double C = (F-32) * 5/9;
        System.out.println("The result is in degree celsius : " + C);
        // Question 7
        System.out.println("Enter the value of Temperature in degree celsius to convert it in degree fahrenheit");
        double Cel = scan.nextDouble();
        double Fah = Cel*1.8 + 32;
        System.out.println("The result is in degree fahrenheit : " + Fah);
        // Question 8
        System.out.println("Enter the radius of circle");
        double R = scan.nextDouble();
        double area = 3.14159265359*R*R;
        double ci = 2*3.14159265359*R;
        System.out.println("The area of circle is : " + area);
        System.out.println("The circumference of circle is : " + ci);
        // Question 9
        System.out.println("Enter your basic salary in lakhs : ");
        double base_salary = scan.nextDouble();
        double DA = 1.3 * base_salary;
        double HRA = 0.4 * base_salary;
        double net_salary = DA + base_salary + HRA;
        System.out.println("The net salary is : "+ net_salary);
        // Question 10
        System.out.println("Enter the value of height in cm : ");
        double cm = scan.nextDouble();
        double inch = cm / 2.54;
        System.out.println("The value of height in inches is : " + inch);
         */
    }
}
