import java.util.Scanner;
public class weekdaychecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter day number");
        int day = s.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
       /*
       my way but above is better approach
        int day = s.nextInt();
        if (day==1) {
            System.out.println("Monday");
        }
        else if (day==2) {
            System.out.println("Tuesday");
        }
        else if (day==3) {
            System.out.println("Wednesday");
        }
        else if (day==4) {
            System.out.println("Thursday");
        }
        else if (day==5) {
            System.out.println("Friday");
        }
        else if (day==6) {
            System.out.println("Saturday");
        }
        else if (day==7) {
            System.out.println("Sunday");
        }
        */
    }
}
