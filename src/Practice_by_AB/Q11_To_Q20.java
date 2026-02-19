package Practice_by_AB;
import java.util.Scanner;
public class Q11_To_Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Question 1
        /*
        System.out.println("Enter the value of weight in kg : ");
        double kg = scan.nextDouble();
        double pound = kg*2.205;
        System.out.println("The value of weight in pounds is : " + pound);
        // Question 12
        System.out.println("Enter value of n ");
        int n = scan.nextInt();
        int sumn = n*(n+1) / 2;
        System.out.println("The sum of first n numbers is : " + sumn);
         */
        // Question 13
        /*
        // agar mai scan.nextInt ko scan.nextLine se phele chalata hu toh wo theel se kam nhi krta
        // pr agar scan.nextLine ko scan.Int se phele use krta hu toh sab sahi kaam krta hai
        System.out.println("Enter your phone number : ");
        long phone = scan.nextLong();
        // agar hum int wala scanner use krege string se pehle toh phele hume empty line ke liye scan.nextLine dena hoga exact abhi nhi pata but jaise jaise java ki depth m jaege tab pata chal jaega
        scan.nextLine();
        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Enter your DOB : ");
        String DOB = scan.nextLine();
        System.out.println("The name of the user is : " + name);
        System.out.println("The DOB of the user is : " + DOB);
        System.out.println("The phone number of the user is : " + phone);
         */
        // Question 14
        // iss ques se square nikalna aagya
        /*
        System.out.println("Enter first side of triangle :");
        double a = scan.nextDouble();
        System.out.println("Enter second side of triangle :");
        double b = scan.nextDouble();
        System.out.println("Enter third side of triangle :");
        double c = scan.nextDouble();
        double s = (a + b + c) / 2;
        double areat = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is : " + areat);
         */
        // Question 15
        /*
        System.out.println("Enter the Base of Parallelogram : ");
        double base = scan.nextDouble();
        System.out.println("Enter the Height of Parallelogram : ");
        double height = scan.nextDouble();
        double areap = base*height;
        System.out.println("The area of Parallelogram is : " + areap);
         */
        // Question 16
        /*
        System.out.println("Enter first diagonal : ");
        double d1 = scan.nextDouble();
        System.out.println("Enter second diagonal : ");
        double d2 = scan.nextDouble();
        double arear = d1*d2 /2;
        System.out.println("The area of rhombus is : " + arear);
         */
        // Question 17
        /*
        System.out.println("Enter the height of trapezium : ");
        double heightt = scan.nextDouble();
        System.out.println("Enter the first parallel base : ");
        double base1 = scan.nextDouble();
        System.out.println("Enter the second parallel base : ");
        double base2 = scan.nextDouble();
        double areat = (base2 + base1)*heightt / 2;
        System.out.println("The area of trapezium is : " + areat);
         */
        // Question 18
        /*
        System.out.println("Enter height of right angle triangle : ");
        double heightrat = scan.nextDouble();
        System.out.println("Enter base of right angle triangle : ");
        double baserat = scan.nextDouble();
        double arearat = heightrat*baserat / 2;
        System.out.println("The area of right angle triangle is : " + arearat);
         */
        // Question 19
        /*
        System.out.println("Enter the height of the cone : ");
        double heightc = scan.nextDouble();
        System.out.println("Enter the radius of cone : ");
        double radiusc = scan.nextDouble();
        double volumec = 3.14159265359*radiusc*radiusc*heightc / 3;
        double surfaceareac = 3.14159265359*radiusc*(radiusc+Math.sqrt(heightc*heightc + radiusc*radiusc));
        System.out.println("The volume of the cone is : " + volumec);
        System.out.println("The surface area of the cone is : " + surfaceareac);
         */
        // Question 20
        /*
        System.out.println("Enter the height of cuboid : ");
        double heightcuboid = scan.nextDouble();
        System.out.println("Enter the width of cuboid : ");
        double widthcuboid = scan.nextDouble();
        System.out.println("Enter the length of cuboid : ");
        double lengthcuboid = scan.nextDouble();
        double volumecuboid = heightcuboid*lengthcuboid*widthcuboid;
        double TSAcuboid = 2*(lengthcuboid*widthcuboid + lengthcuboid*heightcuboid + heightcuboid*widthcuboid);
        System.out.println("The volume of the cuboid is : " + volumecuboid);
        System.out.println("The total surface area of cuboid is : " + TSAcuboid);
         */
    }
}
