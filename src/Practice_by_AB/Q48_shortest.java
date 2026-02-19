package Practice_by_AB;
import java.util.Scanner;
public class Q48_shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int amount,note2000,note500,note200,note100,note50,note20,note10,coin5,coin2,coin1;
        System.out.println("Enter the amount");
        amount = scan.nextInt();
        note2000 = amount/2000;
        note500 = (amount-2000*note2000)/500;
        note200 = (amount-2000*note2000-500*note500)/200;
        note100 = (amount-2000*note2000-500*note500-200*note200)/100;
        note50 = (amount-2000*note2000-500*note500-200*note200-100*note100)/50;
        note20 = (amount-2000*note2000-500*note500-200*note200-100*note100-50*note50)/20;
        note10 = (amount-2000*note2000-500*note500-200*note200-100*note100-50*note50-20*note20)/10;
        coin5 = (amount-2000*note2000-500*note500-200*note200-100*note100-50*note50-20*note20-10*note10)/5;
        coin2 = (amount-2000*note2000-500*note500-200*note200-100*note100-50*note50-20*note20-10*note10-5*coin5)/2;
        coin1 = (amount-2000*note2000-500*note500-200*note200-100*note100-50*note50-20*note20-10*note10-5*coin5-2*coin2)/1;
        if (note2000>0){
            System.out.printf("The %d of note(s) of 2000\n",note2000);
        }
        if (note500>0) {
            System.out.printf("The %d of note(s) of 500\n",note500);
        }
        if (note200>0){
            System.out.printf("The %d of note(s) of 200\n",note200);
        }
        if (note100>0){
            System.out.printf("The %d of note(s) of 100\n",note100);
        }
        if (note50>0){
            System.out.printf("The %d of note(s) of 50\n",note50);
        }
        if (note20>0){
            System.out.printf("The %d of note(s) of 20\n",note20);
        }
        if (note10>0){
            System.out.printf("The %d of note(s) of 10\n",note10);
        }
        if (coin5>0){
            System.out.printf("The %d of coin(s) of 5\n",coin5);
        }
        if (coin2>0){
            System.out.printf("The %d of coin(s) of 2\n",coin2);
        }
        if (coin1>0){
            System.out.printf("The %d of coin(s) of 1\n",coin1);
        }
    }
}
