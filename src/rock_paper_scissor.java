import java.util.Scanner;
import java.util.Random;
public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Rules of this game");
        System.out.println("0 means rock");
        System.out.println("1 means paper");
        System.out.println("2 means scissor");

        System.out.println("Enter number of matches you wanted ");
        int matchNum = s.nextInt();

        int userWin = 0 , comWin = 0;

        for (int i = 0 ; matchNum > i ; i++) {
            System.out.println("Enter your choice : ");
            int a = s.nextInt();

            int b = r.nextInt(3);

            if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)) {
                userWin++ ;
            }
            else if (a == b){
                comWin++ ;
                userWin++;
            }
            else {
                comWin++;
            }
        }

        if (userWin > comWin) {
            System.out.println("You win this match ");
        }
        else if (comWin > userWin) {
            System.out.println("You loose this match ");
        }
        else {
            System.out.println("Match is draw");
        }
    }
}
