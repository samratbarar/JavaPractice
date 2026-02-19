import java.util.Scanner;
public class passchecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your subject 1 marks :");
        int a = s.nextInt();
        if (a >= 33) {
            System.out.println("You passed in this subject");
        }
        else {
            System.out.println("You failed in this subject");
        }
        System.out.println("enter your subject 2 marks :");
        int b = s.nextInt();
        if (b >= 33) {
            System.out.println("You passed in this subject");
        }
        else {
            System.out.println("You failed in this subject");
        }
        System.out.println("enter your subject 3 marks :");
        int c = s.nextInt();
        if (c >= 33) {
            System.out.println("You passed in this subject");
        }
        else {
            System.out.println("You failed in this subject");
        }
        float d = ( a + b + c ) / 3.0f;
        System.out.println("Your overall percentage is:" + d);
        if (d >= 40 && a >= 33 && b >= 33 && c >= 33) {
            System.out.println("You passed in Examination");
        }
        else {
            System.out.println("You failed in Examination");
        }

    }
}
