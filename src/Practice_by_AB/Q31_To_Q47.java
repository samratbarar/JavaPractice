package Practice_by_AB;
import java.util.Scanner;

public class Q31_To_Q47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Question 31
        /*
        System.out.println("Enter the value of years : ");
        double yrs = scan.nextDouble();
        double days = yrs * 365;
        double weeks = yrs * 52 ;
        System.out.println("The number of days in the entered years is ; " + days);
        System.out.println("The number of weeks in the entered years is ; " + weeks);
         */
                // Question 32
        /*
        System.out.println("Enter the float number : ");
        float fn = scan.nextFloat();
        int ip = (int)Math.floor(fn);
        float fp = fn - ip;
        System.out.printf("The integer part of this float number is %d and fractional part is %f",ip,fp);
         */
                // Question 33
        /*
        System.out.println("Enter the X coordinate of first point");
        double x1 = scan.nextDouble();
        System.out.println("Enter the X coordinate of second point");
        double x2 = scan.nextDouble();
        System.out.println("Enter the Y coordinate of first point");
        double y1 = scan.nextDouble();
        System.out.println("Enter the Y coordinate of second point");
        double y2 = scan.nextDouble();
        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("The slope of line joining these two points is : " + slope);
         */
                // Question 34
        /*
        System.out.println("Enter your ID number : ");
        int id = scan.nextInt();
        System.out.println("Enter your total worked hours in a month : ");
        float tim = scan.nextFloat();
        System.out.println("Enter the amount you received per hour");
        int mon = scan.nextInt();
        double salary = tim*mon;
        System.out.println("Your ID is : " + id);
        System.out.printf("The Salary in this month is %.2f",salary);
         */
                // Question 35
        /*
        System.out.println("Enter your weight in kg : ");
        double weight = scan.nextDouble();
        System.out.println("Enter your height in meter : ");
        double height = scan.nextDouble();
        double bmi = weight / (height*height);
        System.out.println("Your BMI is : " + bmi);
         */
                // Question 36
        /*
        System.out.println("Enter the value of a : ");
        double a = scan.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = scan.nextDouble();
        double sq = Math.pow((a+b),2);
        System.out.println("The value of square of (a+b) is : " + sq);
         */
                // Question 37
        /*
        System.out.println("Enter the value of a : ");
        double an = scan.nextDouble();
        System.out.println("Enter the value of b : ");
        double bn = scan.nextDouble();
        double sqn = Math.pow((an-bn),2);
        System.out.println("The value of square of (a+b) is : " + sqn);
         */
                // Question 38
        /*
        System.out.println("Enter the value of a : ");
        double a = scan.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = scan.nextDouble();
        System.out.println("Enter the value of c : ");
        double c = scan.nextDouble();
        double sq = Math.pow((a+b+c),2);
        System.out.println("The value of square of (a+b) is : " + sq);
         */
                // Question 39
        /*
        System.out.println("Enter the value of a : ");
        double a = scan.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = scan.nextDouble();
        double sq = a*a*a+b*b*b;
        System.out.println("The value of square of (a+b) is : " + sq);
         */
                // Question 40
        /*
        System.out.println("Enter the value of a : ");
        double a = scan.nextDouble();
        System.out.println("Enter the value of b : ");
        double b = scan.nextDouble();
        double sq = a*a*a-b*b*b;
        System.out.println("The value of square of (a+b) is : " + sq);
         */
                // Question 41
        /*
        System.out.println("Enter the product price : ");
        double price = scan.nextDouble();
        System.out.println("Enter the value of GST : ");
        double gstper = scan.nextDouble();
        double gst = price*gstper/100;
        double total = price + gst;
        System.out.println("The GST on the product is : " + gst);
        System.out.println("The final price on product after GST is : " + total);
         */
                // Question 42
        /*
        System.out.println("Enter a Char : ");
        String as = scan.next();
        int ascii = as.charAt(0);
        System.out.println("The ascii value of char is : " + ascii);
        */
                // Question 43
        /*
        System.out.println("Enter the digits : ");
        long d = scan.nextLong();
        long las = d % 100;
        System.out.println("The last two digit is : " + las);
        */
                // Question 44
        /*
        System.out.println("Enter the seven digit number : ");
        int se = scan.nextInt();
        String four = Integer.toString(se);
        System.out.print("The output is : " );
        System.out.print(four.charAt(0)+ "  ");
        System.out.print(four.charAt(1)+"  ");
        System.out.print(four.charAt(2)+"  ");
        System.out.print(four.charAt(3)+"  ");
         */
                // Question 45
        /*
        byte a = Byte.SIZE;
        byte a1 = Byte.MIN_VALUE;
        byte a2 = Byte.MAX_VALUE;
        short b = Short.SIZE;
        short b1 = Short.MIN_VALUE;
        short b2 = Short.MAX_VALUE;
        int c = Integer.SIZE;
        int c1 = Integer.MIN_VALUE;
        int c2 = Integer.MAX_VALUE;
        long d = Long.SIZE;
        long d1 = Long.MIN_VALUE;
        long d2 = Long.MAX_VALUE;
        float e = Float.SIZE;
        float e1 = Float.MIN_VALUE;
        float e2 = Float.MAX_VALUE;
        double f = Double.SIZE;
        double f1 = Double.MIN_VALUE;
        double f2 = Double.MAX_VALUE;
        char g = Character.SIZE;
        char g1 = Character.MIN_VALUE;
        char g2 = Character.MAX_VALUE;
        System.out.printf("The Size of byte datatype is %d bits \n",a);
        System.out.printf("The Range of byte datatype is %d to %d \n ",a1,a2);
        System.out.printf("The Size of short datatype is %d bits \n",b);
        System.out.printf("The Range of short datatype is %d to %d \n ",b1,b2);
        System.out.printf("The Size of int datatype is %d bits \n",c);
        System.out.printf("The Range of int datatype is %d to %d \n ",c1,c2);
        System.out.printf("The Size of long datatype is %d bits \n",d);
        System.out.printf("The Range of long datatype is %d to %d \n ",d1,d2);
        System.out.printf("The Size of float datatype is %.0f bits \n",e);
        System.out.printf("The Range of float datatype is %f to %f \n ",e1,e2);
        System.out.printf("The Size of double datatype is %.0f bits \n",f);
        System.out.printf("The Range of double datatype is %f to %f \n ",f1,f2);
        System.out.printf("The Size of char datatype is %d bits \n",(int)g);
        System.out.printf("The Range of char datatype is %d to %d \n ",(int)g1,(int)g2);
         */
                // Question 46
        /*
        System.out.println("Enter the first number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = scan.nextInt();
        int di = n1/n2;
        int rem = n1-(di*n2);
        System.out.println("The remainder is : " + rem);
         */
                // Question 47
        /*
        System.out.println("Enter the first number : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the second number : ");
        int n2 = scan.nextInt();
        String n2str = Integer.toString(n2);
        int l = n2str.length();
        double join = (n1 * Math.pow(10,l)) + n2;
        System.out.printf("The result is %.0f",join);
         */
    }
}
