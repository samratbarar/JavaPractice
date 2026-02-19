import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        //if condition mene copy ki hai mujhse nhi bani thi
        //but mai likh sakta tha agar mujhe leap check karne ka concept aata mathematically
        //aur ab khud se likh sakta hu
        Scanner s = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = s.nextInt();
        if ((year%4==0 && year%100!=0)||year%400==0) {
            System.out.println("This is leap year");
        }
        else {
            System.out.println("This is not leap year");
        }
    }
}
