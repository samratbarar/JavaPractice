package Practice_by_AB;
import java.util.Scanner;
public class Q48_by_methodStatic {
    static int note(int amt,int n){
        int note = amt/n;
        System.out.printf("The %d note(s) of %d\n",note,n);
        int remnote = amt-(note*n);
        return remnote;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int cash = scan.nextInt();
        if (cash>=2000){
            int remthan2000 = note(cash,2000);
            if (remthan2000>=500){
                int remthan500 = note(remthan2000,500);
                if (remthan500>=200){
                    int remthan200 = note(remthan500,200);
                    if (remthan200>=100){
                        int remthan100 = note(remthan200,100);
                        if (remthan100>=50){
                            int remthan50 = note(remthan100,50);
                            if (remthan50>=20){
                                int remthan20 = note(remthan50,20);
                                if (remthan20>=10){
                                    int remthan10 = note(remthan20,10);
                                    if (remthan10>=5){
                                        int remthan5 = note(remthan10,5);
                                        if (remthan5>=2){
                                            int remthan2 = note(remthan5,2);
                                            if (remthan2>=1){
                                                note(remthan2,1);
                                            }
                                        }
                                        else{
                                            note(remthan5,1);
                                        }
                                    }
                                    else if (remthan10>=2) {
                                        int remthan2 = note(remthan10,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else {
                                        note(remthan10,1);
                                    }
                                }
                                else if (remthan20>=5) {
                                    int remthan5 = note(remthan20,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan20>=2) {
                                    int remthan2 = note(remthan20,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan20,1);
                                }
                            }
                            else if (remthan50>=10) {
                                int remthan10 = note(remthan50,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan50>=5) {
                                int remthan5 = note(remthan50,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan50>=2) {
                                int remthan2 = note(remthan50,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan50,1);
                            }
                        }
                        else if (remthan100>=20){
                            int remthan20 = note(remthan100,20);
                            if (remthan20>=10){
                                int remthan10 = note(remthan20,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan20>=5) {
                                int remthan5 = note(remthan20,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan20>=2) {
                                int remthan2 = note(remthan20,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan20,1);
                            }
                        }
                        else if (remthan100>=10) {
                            int remthan10 = note(remthan100,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan100>=5) {
                            int remthan5 = note(remthan100,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan100>=2) {
                            int remthan2 = note(remthan100,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan100,1);
                        }
                    }
                    else if (remthan200>=50){
                        int remthan50 = note(remthan200,50);
                        if (remthan50>=20){
                            int remthan20 = note(remthan50,20);
                            if (remthan20>=10){
                                int remthan10 = note(remthan20,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan20>=5) {
                                int remthan5 = note(remthan20,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan20>=2) {
                                int remthan2 = note(remthan20,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan20,1);
                            }
                        }
                        else if (remthan50>=10) {
                            int remthan10 = note(remthan50,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan50>=5) {
                            int remthan5 = note(remthan50,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan50>=2) {
                            int remthan2 = note(remthan50,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan50,1);
                        }
                    }
                    else if (remthan200>=20){
                        int remthan20 = note(remthan200,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan200>=10) {
                        int remthan10 = note(remthan200,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan200>=5) {
                        int remthan5 = note(remthan200,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan200>=2) {
                        int remthan2 = note(remthan200,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan200,1);
                    }
                }
                else if (remthan500>=100){
                    int remthan100 = note(remthan500,100);
                    if (remthan100>=50){
                        int remthan50 = note(remthan100,50);
                        if (remthan50>=20){
                            int remthan20 = note(remthan50,20);
                            if (remthan20>=10){
                                int remthan10 = note(remthan20,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan20>=5) {
                                int remthan5 = note(remthan20,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan20>=2) {
                                int remthan2 = note(remthan20,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan20,1);
                            }
                        }
                        else if (remthan50>=10) {
                            int remthan10 = note(remthan50,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan50>=5) {
                            int remthan5 = note(remthan50,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan50>=2) {
                            int remthan2 = note(remthan50,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan50,1);
                        }
                    }
                    else if (remthan100>=20){
                        int remthan20 = note(remthan100,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan100>=10) {
                        int remthan10 = note(remthan100,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan100>=5) {
                        int remthan5 = note(remthan100,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan100>=2) {
                        int remthan2 = note(remthan100,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan100,1);
                    }
                }
                else if (remthan500>=50){
                    int remthan50 = note(remthan500,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan500>=20){
                    int remthan20 = note(remthan500,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan500>=10) {
                    int remthan10 = note(remthan500,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan500>=5) {
                    int remthan5 = note(remthan500,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan500>=2) {
                    int remthan2 = note(remthan500,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan500,1);
                }
            }
            else if (remthan2000>=200){
                int remthan200 = note(remthan2000,200);
                if (remthan200>=100){
                    int remthan100 = note(remthan200,100);
                    if (remthan100>=50){
                        int remthan50 = note(remthan100,50);
                        if (remthan50>=20){
                            int remthan20 = note(remthan50,20);
                            if (remthan20>=10){
                                int remthan10 = note(remthan20,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan20>=5) {
                                int remthan5 = note(remthan20,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan20>=2) {
                                int remthan2 = note(remthan20,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan20,1);
                            }
                        }
                        else if (remthan50>=10) {
                            int remthan10 = note(remthan50,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan50>=5) {
                            int remthan5 = note(remthan50,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan50>=2) {
                            int remthan2 = note(remthan50,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan50,1);
                        }
                    }
                    else if (remthan100>=20){
                        int remthan20 = note(remthan100,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan100>=10) {
                        int remthan10 = note(remthan100,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan100>=5) {
                        int remthan5 = note(remthan100,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan100>=2) {
                        int remthan2 = note(remthan100,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan100,1);
                    }
                }
                else if (remthan200>=50){
                    int remthan50 = note(remthan200,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan200>=20){
                    int remthan20 = note(remthan200,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan200>=10) {
                    int remthan10 = note(remthan200,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan200>=5) {
                    int remthan5 = note(remthan200,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan200>=2) {
                    int remthan2 = note(remthan200,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan200,1);
                }
            }
            else if (remthan2000>=100){
                int remthan100 = note(remthan2000,100);
                if (remthan100>=50){
                    int remthan50 = note(remthan100,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan100>=20){
                    int remthan20 = note(remthan100,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan100>=10) {
                    int remthan10 = note(remthan100,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan100>=5) {
                    int remthan5 = note(remthan100,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan100>=2) {
                    int remthan2 = note(remthan100,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan100,1);
                }
            }
            else if (remthan2000>=50){
                int remthan50 = note(remthan2000,50);
                if (remthan50>=20){
                    int remthan20 = note(remthan50,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan50>=10) {
                    int remthan10 = note(remthan50,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan50>=5) {
                    int remthan5 = note(remthan50,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan50>=2) {
                    int remthan2 = note(remthan50,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan50,1);
                }
            }
            else if (remthan2000>=20){
                int remthan20 = note(remthan2000,20);
                if (remthan20>=10){
                    int remthan10 = note(remthan20,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan20>=5) {
                    int remthan5 = note(remthan20,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan20>=2) {
                    int remthan2 = note(remthan20,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan20,1);
                }
            }
            else if (remthan2000>=10) {
                int remthan10 = note(remthan2000,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan2000>=5) {
                int remthan5 = note(remthan2000,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan2000>=2) {
                int remthan2 = note(remthan2000,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan2000,1);
            }
        }
        else if (cash>=500){
            int remthan500 = note(cash,500);
            if (remthan500>=200){
                int remthan200 = note(remthan500,200);
                if (remthan200>=100){
                    int remthan100 = note(remthan200,100);
                    if (remthan100>=50){
                        int remthan50 = note(remthan100,50);
                        if (remthan50>=20){
                            int remthan20 = note(remthan50,20);
                            if (remthan20>=10){
                                int remthan10 = note(remthan20,10);
                                if (remthan10>=5){
                                    int remthan5 = note(remthan10,5);
                                    if (remthan5>=2){
                                        int remthan2 = note(remthan5,2);
                                        if (remthan2>=1){
                                            note(remthan2,1);
                                        }
                                    }
                                    else{
                                        note(remthan5,1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int remthan2 = note(remthan10,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else {
                                    note(remthan10,1);
                                }
                            }
                            else if (remthan20>=5) {
                                int remthan5 = note(remthan20,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan20>=2) {
                                int remthan2 = note(remthan20,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan20,1);
                            }
                        }
                        else if (remthan50>=10) {
                            int remthan10 = note(remthan50,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan50>=5) {
                            int remthan5 = note(remthan50,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan50>=2) {
                            int remthan2 = note(remthan50,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan50,1);
                        }
                    }
                    else if (remthan100>=20){
                        int remthan20 = note(remthan100,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan100>=10) {
                        int remthan10 = note(remthan100,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan100>=5) {
                        int remthan5 = note(remthan100,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan100>=2) {
                        int remthan2 = note(remthan100,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan100,1);
                    }
                }
                else if (remthan200>=50){
                    int remthan50 = note(remthan200,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan200>=20){
                    int remthan20 = note(remthan200,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan200>=10) {
                    int remthan10 = note(remthan200,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan200>=5) {
                    int remthan5 = note(remthan200,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan200>=2) {
                    int remthan2 = note(remthan200,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan200,1);
                }
            }
            else if (remthan500>=100){
                int remthan100 = note(remthan500,100);
                if (remthan100>=50){
                    int remthan50 = note(remthan100,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan100>=20){
                    int remthan20 = note(remthan100,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan100>=10) {
                    int remthan10 = note(remthan100,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan100>=5) {
                    int remthan5 = note(remthan100,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan100>=2) {
                    int remthan2 = note(remthan100,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan100,1);
                }
            }
            else if (remthan500>=50){
                int remthan50 = note(remthan500,50);
                if (remthan50>=20){
                    int remthan20 = note(remthan50,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan50>=10) {
                    int remthan10 = note(remthan50,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan50>=5) {
                    int remthan5 = note(remthan50,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan50>=2) {
                    int remthan2 = note(remthan50,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan50,1);
                }
            }
            else if (remthan500>=20){
                int remthan20 = note(remthan500,20);
                if (remthan20>=10){
                    int remthan10 = note(remthan20,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan20>=5) {
                    int remthan5 = note(remthan20,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan20>=2) {
                    int remthan2 = note(remthan20,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan20,1);
                }
            }
            else if (remthan500>=10) {
                int remthan10 = note(remthan500,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan500>=5) {
                int remthan5 = note(remthan500,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan500>=2) {
                int remthan2 = note(remthan500,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan500,1);
            }
        }
        else if (cash>=200){
            int remthan200 = note(cash,200);
            if (remthan200>=100){
                int remthan100 = note(remthan200,100);
                if (remthan100>=50){
                    int remthan50 = note(remthan100,50);
                    if (remthan50>=20){
                        int remthan20 = note(remthan50,20);
                        if (remthan20>=10){
                            int remthan10 = note(remthan20,10);
                            if (remthan10>=5){
                                int remthan5 = note(remthan10,5);
                                if (remthan5>=2){
                                    int remthan2 = note(remthan5,2);
                                    if (remthan2>=1){
                                        note(remthan2,1);
                                    }
                                }
                                else{
                                    note(remthan5,1);
                                }
                            }
                            else if (remthan10>=2) {
                                int remthan2 = note(remthan10,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else {
                                note(remthan10,1);
                            }
                        }
                        else if (remthan20>=5) {
                            int remthan5 = note(remthan20,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan20>=2) {
                            int remthan2 = note(remthan20,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan20,1);
                        }
                    }
                    else if (remthan50>=10) {
                        int remthan10 = note(remthan50,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan50>=5) {
                        int remthan5 = note(remthan50,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan50>=2) {
                        int remthan2 = note(remthan50,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan50,1);
                    }
                }
                else if (remthan100>=20){
                    int remthan20 = note(remthan100,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan100>=10) {
                    int remthan10 = note(remthan100,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan100>=5) {
                    int remthan5 = note(remthan100,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan100>=2) {
                    int remthan2 = note(remthan100,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan100,1);
                }
            }
            else if (remthan200>=50){
                int remthan50 = note(remthan200,50);
                if (remthan50>=20){
                    int remthan20 = note(remthan50,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan50>=10) {
                    int remthan10 = note(remthan50,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan50>=5) {
                    int remthan5 = note(remthan50,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan50>=2) {
                    int remthan2 = note(remthan50,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan50,1);
                }
            }
            else if (remthan200>=20){
                int remthan20 = note(remthan200,20);
                if (remthan20>=10){
                    int remthan10 = note(remthan20,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan20>=5) {
                    int remthan5 = note(remthan20,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan20>=2) {
                    int remthan2 = note(remthan20,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan20,1);
                }
            }
            else if (remthan200>=10) {
                int remthan10 = note(remthan200,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan200>=5) {
                int remthan5 = note(remthan200,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan200>=2) {
                int remthan2 = note(remthan200,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan200,1);
            }
        }
        else if (cash>=100){
            int remthan100 = note(cash,100);
            if (remthan100>=50){
                int remthan50 = note(remthan100,50);
                if (remthan50>=20){
                    int remthan20 = note(remthan50,20);
                    if (remthan20>=10){
                        int remthan10 = note(remthan20,10);
                        if (remthan10>=5){
                            int remthan5 = note(remthan10,5);
                            if (remthan5>=2){
                                int remthan2 = note(remthan5,2);
                                if (remthan2>=1){
                                    note(remthan2,1);
                                }
                            }
                            else{
                                note(remthan5,1);
                            }
                        }
                        else if (remthan10>=2) {
                            int remthan2 = note(remthan10,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else {
                            note(remthan10,1);
                        }
                    }
                    else if (remthan20>=5) {
                        int remthan5 = note(remthan20,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan20>=2) {
                        int remthan2 = note(remthan20,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan20,1);
                    }
                }
                else if (remthan50>=10) {
                    int remthan10 = note(remthan50,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan50>=5) {
                    int remthan5 = note(remthan50,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan50>=2) {
                    int remthan2 = note(remthan50,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan50,1);
                }
            }
            else if (remthan100>=20){
                int remthan20 = note(remthan100,20);
                if (remthan20>=10){
                    int remthan10 = note(remthan20,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan20>=5) {
                    int remthan5 = note(remthan20,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan20>=2) {
                    int remthan2 = note(remthan20,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan20,1);
                }
            }
            else if (remthan100>=10) {
                int remthan10 = note(remthan100,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan100>=5) {
                int remthan5 = note(remthan100,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan100>=2) {
                int remthan2 = note(remthan100,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan100,1);
            }
        }
        else if (cash>=50){
            int remthan50 = note(cash,50);
            if (remthan50>=20){
                int remthan20 = note(remthan50,20);
                if (remthan20>=10){
                    int remthan10 = note(remthan20,10);
                    if (remthan10>=5){
                        int remthan5 = note(remthan10,5);
                        if (remthan5>=2){
                            int remthan2 = note(remthan5,2);
                            if (remthan2>=1){
                                note(remthan2,1);
                            }
                        }
                        else{
                            note(remthan5,1);
                        }
                    }
                    else if (remthan10>=2) {
                        int remthan2 = note(remthan10,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else {
                        note(remthan10,1);
                    }
                }
                else if (remthan20>=5) {
                    int remthan5 = note(remthan20,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan20>=2) {
                    int remthan2 = note(remthan20,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan20,1);
                }
            }
            else if (remthan50>=10) {
                int remthan10 = note(remthan50,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan50>=5) {
                int remthan5 = note(remthan50,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan50>=2) {
                int remthan2 = note(remthan50,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan50,1);
            }
        }
        else if (cash>=20){
            int remthan20 = note(cash,20);
            if (remthan20>=10){
                int remthan10 = note(remthan20,10);
                if (remthan10>=5){
                    int remthan5 = note(remthan10,5);
                    if (remthan5>=2){
                        int remthan2 = note(remthan5,2);
                        if (remthan2>=1){
                            note(remthan2,1);
                        }
                    }
                    else{
                        note(remthan5,1);
                    }
                }
                else if (remthan10>=2) {
                    int remthan2 = note(remthan10,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else {
                    note(remthan10,1);
                }
            }
            else if (remthan20>=5) {
                int remthan5 = note(remthan20,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan20>=2) {
                int remthan2 = note(remthan20,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan20,1);
            }
        }
        else if (cash>=10) {
            int remthan10 = note(cash,10);
            if (remthan10>=5){
                int remthan5 = note(remthan10,5);
                if (remthan5>=2){
                    int remthan2 = note(remthan5,2);
                    if (remthan2>=1){
                        note(remthan2,1);
                    }
                }
                else{
                    note(remthan5,1);
                }
            }
            else if (remthan10>=2) {
                int remthan2 = note(remthan10,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else {
                note(remthan10,1);
            }
        }
        else if (cash>=5) {
            int remthan5 = note(cash,5);
            if (remthan5>=2){
                int remthan2 = note(remthan5,2);
                if (remthan2>=1){
                    note(remthan2,1);
                }
            }
            else{
                note(remthan5,1);
            }
        }
        else if (cash>=2) {
            int remthan2 = note(cash,2);
            if (remthan2>=1){
                note(remthan2,1);
            }
        }
        else{
            note(cash,1);
        }
    }
}
