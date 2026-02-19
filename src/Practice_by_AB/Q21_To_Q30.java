package Practice_by_AB;
import java.util.Scanner;
public class Q21_To_Q30 {
/*
    static double obtmarks(String num){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the marks obtained in %s subject : ",num);
        double obsub1 = scan.nextDouble();
        return obsub1;
    }
    static  double maxmarks(String num){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the maximum marks in %s subject : ",num);
        double maxsub1 = scan.nextDouble();
        return maxsub1;
    }
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Question 21
        /*
        System.out.println("Enter the height of cylinder : ");
        double heightcy = scan.nextDouble();
        System.out.println("Enter the radius of cylinder : ");
        double radiuscy = scan.nextDouble();
        double volumecy = 3.14159265359*radiuscy*radiuscy*heightcy;
        double surfaceareacy = 2*3.14159265359*radiuscy*(radiuscy+heightcy);
        System.out.println("The volume of the cylinder is : " + volumecy);
        System.out.println("The surface area of the cylinder is : " + surfaceareacy);
         */
        // question 22
        /*
        System.out.println("Enter the radius of sphere : ");
        double radiussph = scan.nextDouble();
        double volumesph = 4*3.14159265359*radiussph*radiussph*radiussph / 3;
        double surfaceareasph = 4*3.14159265359*radiussph*radiussph;
        System.out.println("The volume of sphere is : " + volumesph);
        System.out.println("The surface area of sphere is : " + surfaceareasph);
         */
        // Question 23
        /*
        System.out.println("Enter the side of the cube : ");
        double sidecube = scan.nextDouble();
        double surfaceareacube = 6*sidecube*sidecube;
        double volumecube = sidecube*sidecube*sidecube;
        System.out.println("The surface area of cube is : " + surfaceareacube);
        System.out.println("The volume of cube is : " +volumecube);
         */
        // Question 24
        /*
        System.out.println("Enter the radius of the circle : ");
        double radiuscir = scan.nextDouble();
        System.out.println("Enter the length of the rectangle : ");
        double lengthrec = scan.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double widthrec = scan.nextDouble();
        System.out.println("Enter the first side of triangle : ");
        double sidetri1 = scan.nextDouble();
        System.out.println("Enter the second side of triangle : ");
        double sidetri2 = scan.nextDouble();
        System.out.println("Enter the third side of triangle : ");
        double sidetri3 = scan.nextDouble();
        double pericir = 2*3.14159265359*radiuscir;
        double perirec = 2*(lengthrec+widthrec);
        double peritri = sidetri1+ sidetri2+sidetri3;
        System.out.println("The perimeter of circle is : " + pericir);
        System.out.println("The perimeter of rectangle is : " + perirec);
        System.out.println("The perimeter of triangle is : " + peritri);
         */
        // Question 25
        /*
        System.out.println("Enter your principal amount : ");
        double pramt = scan.nextDouble();
        System.out.println("Enter the annual interest rate :");
        double rate = scan.nextDouble();
        System.out.println("Enter the time period(in years) : ");
        double t = scan.nextDouble();
        System.out.println("Enter the number of times interest applied per year :");
        double n = scan.nextDouble();
        double power = Math.pow((1+(rate/(n*100))),n*t);
        double finalamt = pramt*power;
        double interestc = finalamt - pramt;
        System.out.println("The total interest is : " + interestc);
        System.out.println("The total amount is : " + finalamt);
         */
        // Question 26
        /*
        System.out.println("Enter your principal amount : ");
        double priamt = scan.nextDouble();
        System.out.println("Enter the annual interest rate : ");
        double rates = scan.nextDouble();
        System.out.println("Enter time period(in years) : ");
        double time = scan.nextDouble();
        double finalamts = priamt*(1+ (rates*time)/100);
        double interests = finalamts-priamt;
        System.out.println("The total interest is : " + interests);
        System.out.println("The total amount is : " + finalamts);
         */
        // Question 27
        /*
        System.out.println("Enter the value of n : ");
        int n = scan.nextInt();
        System.out.print("The value of 2*n is : ");
        System.out.println(n<<1);
        System.out.print("The Power of 2 nth times is : ");
        System.out.println(1 << n);
         */
        // Question 28
        /*
        System.out.println("Enter the value of n : ");
        int n = scan.nextInt();
        System.out.println("The value of 2-n is : ");
        System.out.println((1<<1) - n);
         */
        // Question 29
        /*
        System.out.println("Enter the value of seconds : ");
        int sec = scan.nextInt();
        double min = sec / 60;
        double hrs = min / 60 ;
        System.out.println("The minutes in entered seconds is : " + min);
        System.out.println("The hours in entered seconds is : " + hrs);
         */
        // Question 30
        /*
//        System.out.println("Enter the marks obtained in first subject : ");
//        double obsub1 = scan.nextDouble();
//        System.out.println("Enter the maximum marks in first subject : ");
//        double maxsub1 = scan.nextDouble();
//        System.out.println("Enter the marks obtained in second subject : ");
//        double obsub2 = scan.nextDouble();
//        System.out.println("Enter the maximum marks in second subject : ");
//        double maxsub2 = scan.nextDouble();
//        System.out.println("Enter the marks obtained in third subject : ");
//        double obsub3 = scan.nextDouble();
//        System.out.println("Enter the maximum marks in third subject : ");
//        double maxsub3 = scan.nextDouble();
//        System.out.println("Enter the marks obtained in fourth subject : ");
//        double obsub4 = scan.nextDouble();
//        System.out.println("Enter the maximum marks in fourth subject : ");
//        double maxsub4 = scan.nextDouble();
//        System.out.println("Enter the marks obtained in fiveth subject : ");
//        double obsub5 = scan.nextDouble();
//        System.out.println("Enter the maximum marks in fiveth subject : ");
//        double maxsub5 = scan.nextDouble();
//        double obtotal = obsub1 + obsub2 + obsub3 + obsub4 + obsub5;
//        double maxtotal = maxsub1 + maxsub2 + maxsub3 + maxsub4 + maxsub5;
//        System.out.println("The total marks obtained by user in 5 sunject is : " + obtotal);
//        double percentageof5 = (obtotal * 100) / maxtotal;
//        System.out.println("The Percentage obtained by user in 5 subject is " + percentageof5 + "%");
        double om1 = obtmarks("first");
        double mm1 = maxmarks("first");
        double om2 = obtmarks("second");
        double mm2 = maxmarks("second");
        double om3 = obtmarks("third");
        double mm3 = maxmarks("third");
        double om4 = obtmarks("fourth");
        double mm4 = maxmarks("fourth");
        double om5 = obtmarks("fiveth");
        double mm5 = maxmarks("fiveth");
        double omt = om1 + om2 + om3 + om4 + om5;
        double mmt = mm1 + mm2 + mm3 + mm4 + mm5;
        System.out.println("The total marks obtained by user in 5 sunject is : " + omt);
        double percentage = (omt*100) / mmt ;
        System.out.println("The Percentage obtained by user in 5 subject is " + percentage + " %");
         */
    }
}
