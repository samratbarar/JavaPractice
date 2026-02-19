package Practice_by_AB;
import java.util.Scanner;
public class Q48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int cash = scan.nextInt();
        if (cash>=2000){
            int note2000 = cash/2000;
            System.out.printf("The %d note(s) of 2000\n",note2000);
            int remthan2000 = cash-(note2000*2000);
            if (remthan2000>=500){
                int note500 = remthan2000/500;
                System.out.printf("The %d note(s) of 500\n",note500);
                int remthan500 = remthan2000-(note500*500);
                if (remthan500>=200){
                    int note200 = remthan500/200;
                    System.out.printf("The %d note(s) of 200\n",note200);
                    int remthan200= remthan500-(note200*200);
                    if (remthan200>=100){
                        int note100= remthan200/100;
                        System.out.printf("The %d note(s) of 100 \n",note100);
                        int remthan100 = remthan200-(note100*100);
                        if (remthan100>=50){
                            int note50 = remthan100/50;
                            System.out.printf("The %d note(s) of 50 \n",note50);
                            int remthan50 = remthan100-(note50*50);
                            if (remthan50>=20){
                                int note20 = remthan50/20;
                                System.out.printf("The %d note(s) of 20\n",note20);
                                int remthan20 = remthan50 -(note20*20);
                                if (remthan20>=10){
                                    int note10 = remthan20/10;
                                    System.out.printf("The %d note(s) of 10 \n",note10);
                                    int remthan10 = remthan20-(note10*10);
                                    if (remthan10>=5){
                                        int coin5 = remthan10/5;
                                        System.out.printf("The %d coin(s) of 5\n",coin5);
                                        int remthan5= remthan10-(coin5*5);
                                        if (remthan5>=2){
                                            int coin2 = remthan5/2;
                                            System.out.printf("The %d coin(s) of 2\n",coin2);
                                            int remthan2 = remthan5-(coin2*2);
                                            if (remthan2>=1){
                                                int coin1=remthan2/1;
                                                System.out.printf("The %d coin(s) of 1\n",coin1);
                                            }
                                        }
                                        else if (remthan5>=1){
                                            int coin1=remthan5/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan10>=2) {
                                        int coin2 = remthan10/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan10-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan10>=1) {
                                        int coin1=remthan10/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan20>=5) {
                                    int coin5 = remthan20/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan20-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if(remthan20>=2){
                                    int coin2 = remthan20/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan20-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if(remthan20>=1){
                                    int coin1=remthan20/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan50>=10){
                                int note10 = remthan50/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan50-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan50>=5){
                                int coin5 = remthan50/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan50-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan50>=2) {
                                int coin2 = remthan50/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan50-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan50>=1){
                                int coin1=remthan50/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan100>=20){
                            int note20 = remthan100/20;
                            System.out.printf("The %d note(s) of 20\n",note20);
                            int remthan20 = remthan100 -(note20*20);
                            if (remthan20>=10){
                                int note10 = remthan20/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan20-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan20>=5) {
                                int coin5 = remthan20/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan20-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=2){
                                int coin2 = remthan20/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan20-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=1){
                                int coin1=remthan20/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan100>=10){
                            int note10 = remthan100/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan100-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan100>=5) {
                            int coin5 = remthan100/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan100-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan100>=2){
                            int coin2 = remthan100/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan100-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan100>=1){
                            int coin1=remthan100/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=50) {
                        int note50 = remthan200/50;
                        System.out.printf("The %d note(s) of 50 \n",note50);
                        int remthan50 = remthan200-(note50*50);
                        if (remthan50>=20){
                            int note20 = remthan50/20;
                            System.out.printf("The %d note(s) of 20\n",note20);
                            int remthan20 = remthan50 -(note20*20);
                            if (remthan20>=10){
                                int note10 = remthan20/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan20-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan20>=5) {
                                int coin5 = remthan20/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan20-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=2){
                                int coin2 = remthan20/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan20-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=1){
                                int coin1=remthan20/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=10){
                            int note10 = remthan50/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan50-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=5){
                            int coin5 = remthan50/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan50-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan50>=2) {
                            int coin2 = remthan50/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan50-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=1){
                            int coin1=remthan50/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=20) {
                        int note20 = remthan200/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan200 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=10) {
                        int note10 = remthan200/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan200-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=5) {
                        int coin5 = remthan200/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan200-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=2) {
                        int coin2 = remthan200/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan200-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan200>=1) {
                        int coin1=remthan200/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=100) {
                    int note100= remthan500/100;
                    System.out.printf("The %d note(s) of 100 \n",note100);
                    int remthan100 = remthan500-(note100*100);
                    if (remthan100>=50){
                        int note50 = remthan100/50;
                        System.out.printf("The %d note(s) of 50 \n",note50);
                        int remthan50 = remthan100-(note50*50);
                        if (remthan50>=20){
                            int note20 = remthan50/20;
                            System.out.printf("The %d note(s) of 20\n",note20);
                            int remthan20 = remthan50 -(note20*20);
                            if (remthan20>=10){
                                int note10 = remthan20/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan20-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan20>=5) {
                                int coin5 = remthan20/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan20-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=2){
                                int coin2 = remthan20/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan20-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=1){
                                int coin1=remthan20/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=10){
                            int note10 = remthan50/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan50-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=5){
                            int coin5 = remthan50/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan50-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan50>=2) {
                            int coin2 = remthan50/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan50-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=1){
                            int coin1=remthan50/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=20){
                        int note20 = remthan100/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan100 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=10){
                        int note10 = remthan100/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan100-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan100>=5) {
                        int coin5 = remthan100/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan100-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=2){
                        int coin2 = remthan100/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan100-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=1){
                        int coin1=remthan100/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=50) {
                    int note50 = remthan500/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan500-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=20) {
                    int note20 = remthan500/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan500 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=10) {
                    int note10 = remthan500/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan500-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=5) {
                    int coin5 = remthan500/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan500-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=2) {
                    int coin2 = remthan500/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan500-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan500>=1) {
                    int coin1=remthan500/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=200) {
                int note200 = remthan2000/200;
                System.out.printf("The %d note(s) of 200\n",note200);
                int remthan200= remthan2000-(note200*200);
                if (remthan200>=100){
                    int note100= remthan200/100;
                    System.out.printf("The %d note(s) of 100 \n",note100);
                    int remthan100 = remthan200-(note100*100);
                    if (remthan100>=50){
                        int note50 = remthan100/50;
                        System.out.printf("The %d note(s) of 50 \n",note50);
                        int remthan50 = remthan100-(note50*50);
                        if (remthan50>=20){
                            int note20 = remthan50/20;
                            System.out.printf("The %d note(s) of 20\n",note20);
                            int remthan20 = remthan50 -(note20*20);
                            if (remthan20>=10){
                                int note10 = remthan20/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan20-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan20>=5) {
                                int coin5 = remthan20/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan20-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=2){
                                int coin2 = remthan20/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan20-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=1){
                                int coin1=remthan20/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=10){
                            int note10 = remthan50/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan50-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=5){
                            int coin5 = remthan50/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan50-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan50>=2) {
                            int coin2 = remthan50/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan50-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=1){
                            int coin1=remthan50/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=20){
                        int note20 = remthan100/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan100 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=10){
                        int note10 = remthan100/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan100-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan100>=5) {
                        int coin5 = remthan100/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan100-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=2){
                        int coin2 = remthan100/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan100-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=1){
                        int coin1=remthan100/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=50) {
                    int note50 = remthan200/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan200-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=20) {
                    int note20 = remthan200/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan200 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=10) {
                    int note10 = remthan200/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan200-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=5) {
                    int coin5 = remthan200/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan200-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=2) {
                    int coin2 = remthan200/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan200-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=1) {
                    int coin1=remthan200/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=100) {
                int note100= remthan2000/100;
                System.out.printf("The %d note(s) of 100 \n",note100);
                int remthan100 = remthan2000-(note100*100);
                if (remthan100>=50){
                    int note50 = remthan100/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan100-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=20){
                    int note20 = remthan100/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan100 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=10){
                    int note10 = remthan100/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan100-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan100>=5) {
                    int coin5 = remthan100/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan100-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=2){
                    int coin2 = remthan100/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan100-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=1){
                    int coin1=remthan100/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=50) {
                int note50 = remthan2000/50;
                System.out.printf("The %d note(s) of 50 \n",note50);
                int remthan50 = remthan2000-(note50*50);
                if (remthan50>=20){
                    int note20 = remthan50/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan50 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=10){
                    int note10 = remthan50/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan50-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=5){
                    int coin5 = remthan50/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan50-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan50>=2) {
                    int coin2 = remthan50/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan50-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=1){
                    int coin1=remthan50/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=20) {
                int note20 = remthan2000/20;
                System.out.printf("The %d note(s) of 20\n",note20);
                int remthan20 = remthan2000 -(note20*20);
                if (remthan20>=10){
                    int note10 = remthan20/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan20-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan20>=5) {
                    int coin5 = remthan20/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan20-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=2){
                    int coin2 = remthan20/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan20-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=1){
                    int coin1=remthan20/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=10) {
                int note10 = remthan2000/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan2000-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=5) {
                int coin5 = remthan2000/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan2000-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=2) {
                int coin2 = remthan2000/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan2000-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan2000>=1) {
                int coin1=remthan2000/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=500) {
            int note500 = cash/500;
            System.out.printf("The %d note(s) of 500\n",note500);
            int remthan500 = cash-(note500*500);
            if (remthan500>=200){
                int note200 = remthan500/200;
                System.out.printf("The %d note(s) of 200\n",note200);
                int remthan200= remthan500-(note200*200);
                if (remthan200>=100){
                    int note100= remthan200/100;
                    System.out.printf("The %d note(s) of 100 \n",note100);
                    int remthan100 = remthan200-(note100*100);
                    if (remthan100>=50){
                        int note50 = remthan100/50;
                        System.out.printf("The %d note(s) of 50 \n",note50);
                        int remthan50 = remthan100-(note50*50);
                        if (remthan50>=20){
                            int note20 = remthan50/20;
                            System.out.printf("The %d note(s) of 20\n",note20);
                            int remthan20 = remthan50 -(note20*20);
                            if (remthan20>=10){
                                int note10 = remthan20/10;
                                System.out.printf("The %d note(s) of 10 \n",note10);
                                int remthan10 = remthan20-(note10*10);
                                if (remthan10>=5){
                                    int coin5 = remthan10/5;
                                    System.out.printf("The %d coin(s) of 5\n",coin5);
                                    int remthan5= remthan10-(coin5*5);
                                    if (remthan5>=2){
                                        int coin2 = remthan5/2;
                                        System.out.printf("The %d coin(s) of 2\n",coin2);
                                        int remthan2 = remthan5-(coin2*2);
                                        if (remthan2>=1){
                                            int coin1=remthan2/1;
                                            System.out.printf("The %d coin(s) of 1\n",coin1);
                                        }
                                    }
                                    else if (remthan5>=1){
                                        int coin1=remthan5/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=2) {
                                    int coin2 = remthan10/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan10-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan10>=1) {
                                    int coin1=remthan10/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan20>=5) {
                                int coin5 = remthan20/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan20-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=2){
                                int coin2 = remthan20/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan20-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if(remthan20>=1){
                                int coin1=remthan20/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=10){
                            int note10 = remthan50/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan50-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=5){
                            int coin5 = remthan50/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan50-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan50>=2) {
                            int coin2 = remthan50/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan50-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan50>=1){
                            int coin1=remthan50/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=20){
                        int note20 = remthan100/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan100 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=10){
                        int note10 = remthan100/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan100-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan100>=5) {
                        int coin5 = remthan100/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan100-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=2){
                        int coin2 = remthan100/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan100-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan100>=1){
                        int coin1=remthan100/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=50) {
                    int note50 = remthan200/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan200-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=20) {
                    int note20 = remthan200/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan200 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=10) {
                    int note10 = remthan200/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan200-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=5) {
                    int coin5 = remthan200/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan200-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=2) {
                    int coin2 = remthan200/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan200-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan200>=1) {
                    int coin1=remthan200/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=100) {
                int note100= remthan500/100;
                System.out.printf("The %d note(s) of 100 \n",note100);
                int remthan100 = remthan500-(note100*100);
                if (remthan100>=50){
                    int note50 = remthan100/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan100-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=20){
                    int note20 = remthan100/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan100 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=10){
                    int note10 = remthan100/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan100-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan100>=5) {
                    int coin5 = remthan100/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan100-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=2){
                    int coin2 = remthan100/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan100-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=1){
                    int coin1=remthan100/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=50) {
                int note50 = remthan500/50;
                System.out.printf("The %d note(s) of 50 \n",note50);
                int remthan50 = remthan500-(note50*50);
                if (remthan50>=20){
                    int note20 = remthan50/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan50 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=10){
                    int note10 = remthan50/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan50-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=5){
                    int coin5 = remthan50/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan50-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan50>=2) {
                    int coin2 = remthan50/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan50-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=1){
                    int coin1=remthan50/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=20) {
                int note20 = remthan500/20;
                System.out.printf("The %d note(s) of 20\n",note20);
                int remthan20 = remthan500 -(note20*20);
                if (remthan20>=10){
                    int note10 = remthan20/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan20-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan20>=5) {
                    int coin5 = remthan20/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan20-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=2){
                    int coin2 = remthan20/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan20-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=1){
                    int coin1=remthan20/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=10) {
                int note10 = remthan500/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan500-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=5) {
                int coin5 = remthan500/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan500-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=2) {
                int coin2 = remthan500/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan500-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan500>=1) {
                int coin1=remthan500/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=200) {
            int note200 = cash/200;
            System.out.printf("The %d note(s) of 200\n",note200);
            int remthan200= cash-(note200*200);
            if (remthan200>=100){
                int note100= remthan200/100;
                System.out.printf("The %d note(s) of 100 \n",note100);
                int remthan100 = remthan200-(note100*100);
                if (remthan100>=50){
                    int note50 = remthan100/50;
                    System.out.printf("The %d note(s) of 50 \n",note50);
                    int remthan50 = remthan100-(note50*50);
                    if (remthan50>=20){
                        int note20 = remthan50/20;
                        System.out.printf("The %d note(s) of 20\n",note20);
                        int remthan20 = remthan50 -(note20*20);
                        if (remthan20>=10){
                            int note10 = remthan20/10;
                            System.out.printf("The %d note(s) of 10 \n",note10);
                            int remthan10 = remthan20-(note10*10);
                            if (remthan10>=5){
                                int coin5 = remthan10/5;
                                System.out.printf("The %d coin(s) of 5\n",coin5);
                                int remthan5= remthan10-(coin5*5);
                                if (remthan5>=2){
                                    int coin2 = remthan5/2;
                                    System.out.printf("The %d coin(s) of 2\n",coin2);
                                    int remthan2 = remthan5-(coin2*2);
                                    if (remthan2>=1){
                                        int coin1=remthan2/1;
                                        System.out.printf("The %d coin(s) of 1\n",coin1);
                                    }
                                }
                                else if (remthan5>=1){
                                    int coin1=remthan5/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=2) {
                                int coin2 = remthan10/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan10-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan10>=1) {
                                int coin1=remthan10/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan20>=5) {
                            int coin5 = remthan20/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan20-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=2){
                            int coin2 = remthan20/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan20-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if(remthan20>=1){
                            int coin1=remthan20/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=10){
                        int note10 = remthan50/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan50-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=5){
                        int coin5 = remthan50/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan50-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan50>=2) {
                        int coin2 = remthan50/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan50-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan50>=1){
                        int coin1=remthan50/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=20){
                    int note20 = remthan100/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan100 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=10){
                    int note10 = remthan100/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan100-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan100>=5) {
                    int coin5 = remthan100/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan100-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=2){
                    int coin2 = remthan100/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan100-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan100>=1){
                    int coin1=remthan100/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=50) {
                int note50 = remthan200/50;
                System.out.printf("The %d note(s) of 50 \n",note50);
                int remthan50 = remthan200-(note50*50);
                if (remthan50>=20){
                    int note20 = remthan50/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan50 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=10){
                    int note10 = remthan50/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan50-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=5){
                    int coin5 = remthan50/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan50-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan50>=2) {
                    int coin2 = remthan50/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan50-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=1){
                    int coin1=remthan50/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=20) {
                int note20 = remthan200/20;
                System.out.printf("The %d note(s) of 20\n",note20);
                int remthan20 = remthan200 -(note20*20);
                if (remthan20>=10){
                    int note10 = remthan20/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan20-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan20>=5) {
                    int coin5 = remthan20/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan20-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=2){
                    int coin2 = remthan20/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan20-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=1){
                    int coin1=remthan20/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=10) {
                int note10 = remthan200/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan200-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=5) {
                int coin5 = remthan200/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan200-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=2) {
                int coin2 = remthan200/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan200-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan200>=1) {
                int coin1=remthan200/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=100) {
            int note100= cash/100;
            System.out.printf("The %d note(s) of 100 \n",note100);
            int remthan100 = cash-(note100*100);
            if (remthan100>=50){
                int note50 = remthan100/50;
                System.out.printf("The %d note(s) of 50 \n",note50);
                int remthan50 = remthan100-(note50*50);
                if (remthan50>=20){
                    int note20 = remthan50/20;
                    System.out.printf("The %d note(s) of 20\n",note20);
                    int remthan20 = remthan50 -(note20*20);
                    if (remthan20>=10){
                        int note10 = remthan20/10;
                        System.out.printf("The %d note(s) of 10 \n",note10);
                        int remthan10 = remthan20-(note10*10);
                        if (remthan10>=5){
                            int coin5 = remthan10/5;
                            System.out.printf("The %d coin(s) of 5\n",coin5);
                            int remthan5= remthan10-(coin5*5);
                            if (remthan5>=2){
                                int coin2 = remthan5/2;
                                System.out.printf("The %d coin(s) of 2\n",coin2);
                                int remthan2 = remthan5-(coin2*2);
                                if (remthan2>=1){
                                    int coin1=remthan2/1;
                                    System.out.printf("The %d coin(s) of 1\n",coin1);
                                }
                            }
                            else if (remthan5>=1){
                                int coin1=remthan5/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=2) {
                            int coin2 = remthan10/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan10-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan10>=1) {
                            int coin1=remthan10/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan20>=5) {
                        int coin5 = remthan20/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan20-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=2){
                        int coin2 = remthan20/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan20-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if(remthan20>=1){
                        int coin1=remthan20/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=10){
                    int note10 = remthan50/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan50-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=5){
                    int coin5 = remthan50/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan50-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan50>=2) {
                    int coin2 = remthan50/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan50-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan50>=1){
                    int coin1=remthan50/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan100>=20){
                int note20 = remthan100/20;
                System.out.printf("The %d note(s) of 20\n",note20);
                int remthan20 = remthan100 -(note20*20);
                if (remthan20>=10){
                    int note10 = remthan20/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan20-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan20>=5) {
                    int coin5 = remthan20/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan20-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=2){
                    int coin2 = remthan20/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan20-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=1){
                    int coin1=remthan20/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan100>=10){
                int note10 = remthan100/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan100-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan100>=5) {
                int coin5 = remthan100/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan100-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan100>=2){
                int coin2 = remthan100/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan100-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan100>=1){
                int coin1=remthan100/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=50) {
            int note50 = cash/50;
            System.out.printf("The %d note(s) of 50 \n",note50);
            int remthan50 = cash-(note50*50);
            if (remthan50>=20){
                int note20 = remthan50/20;
                System.out.printf("The %d note(s) of 20\n",note20);
                int remthan20 = remthan50 -(note20*20);
                if (remthan20>=10){
                    int note10 = remthan20/10;
                    System.out.printf("The %d note(s) of 10 \n",note10);
                    int remthan10 = remthan20-(note10*10);
                    if (remthan10>=5){
                        int coin5 = remthan10/5;
                        System.out.printf("The %d coin(s) of 5\n",coin5);
                        int remthan5= remthan10-(coin5*5);
                        if (remthan5>=2){
                            int coin2 = remthan5/2;
                            System.out.printf("The %d coin(s) of 2\n",coin2);
                            int remthan2 = remthan5-(coin2*2);
                            if (remthan2>=1){
                                int coin1=remthan2/1;
                                System.out.printf("The %d coin(s) of 1\n",coin1);
                            }
                        }
                        else if (remthan5>=1){
                            int coin1=remthan5/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=2) {
                        int coin2 = remthan10/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan10-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan10>=1) {
                        int coin1=remthan10/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan20>=5) {
                    int coin5 = remthan20/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan20-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=2){
                    int coin2 = remthan20/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan20-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if(remthan20>=1){
                    int coin1=remthan20/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan50>=10){
                int note10 = remthan50/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan50-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan50>=5){
                int coin5 = remthan50/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan50-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan50>=2) {
                int coin2 = remthan50/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan50-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan50>=1){
                int coin1=remthan50/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=20) {
            int note20 = cash/20;
            System.out.printf("The %d note(s) of 20\n",note20);
            int remthan20 = cash-(note20*20);
            if (remthan20>=10){
                int note10 = remthan20/10;
                System.out.printf("The %d note(s) of 10 \n",note10);
                int remthan10 = remthan20-(note10*10);
                if (remthan10>=5){
                    int coin5 = remthan10/5;
                    System.out.printf("The %d coin(s) of 5\n",coin5);
                    int remthan5= remthan10-(coin5*5);
                    if (remthan5>=2){
                        int coin2 = remthan5/2;
                        System.out.printf("The %d coin(s) of 2\n",coin2);
                        int remthan2 = remthan5-(coin2*2);
                        if (remthan2>=1){
                            int coin1=remthan2/1;
                            System.out.printf("The %d coin(s) of 1\n",coin1);
                        }
                    }
                    else if (remthan5>=1){
                        int coin1=remthan5/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=2) {
                    int coin2 = remthan10/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan10-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan10>=1) {
                    int coin1=remthan10/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan20>=5) {
                int coin5 = remthan20/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan20-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan20>=2){
                int coin2 = remthan20/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan20-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if(remthan20>=1){
                int coin1=remthan20/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=10) {
            int note10 = cash/10;
            System.out.printf("The %d note(s) of 10 \n",note10);
            int remthan10 = cash-(note10*10);
            if (remthan10>=5){
                int coin5 = remthan10/5;
                System.out.printf("The %d coin(s) of 5\n",coin5);
                int remthan5= remthan10-(coin5*5);
                if (remthan5>=2){
                    int coin2 = remthan5/2;
                    System.out.printf("The %d coin(s) of 2\n",coin2);
                    int remthan2 = remthan5-(coin2*2);
                    if (remthan2>=1){
                        int coin1=remthan2/1;
                        System.out.printf("The %d coin(s) of 1\n",coin1);
                    }
                }
                else if (remthan5>=1){
                    int coin1=remthan5/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan10>=2) {
                int coin2 = remthan10/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan10-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan10>=1) {
                int coin1=remthan10/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=5) {
            int coin5 = cash/5;
            System.out.printf("The %d coin(s) of 5\n",coin5);
            int remthan5= cash-(coin5*5);
            if (remthan5>=2){
                int coin2 = remthan5/2;
                System.out.printf("The %d coin(s) of 2\n",coin2);
                int remthan2 = remthan5-(coin2*2);
                if (remthan2>=1){
                    int coin1=remthan2/1;
                    System.out.printf("The %d coin(s) of 1\n",coin1);
                }
            }
            else if (remthan5>=1){
                int coin1=remthan5/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=2) {
            int coin2 = cash/2;
            System.out.printf("The %d coin(s) of 2\n",coin2);
            int remthan2 = cash-(coin2*2);
            if (remthan2>=1){
                int coin1=remthan2/1;
                System.out.printf("The %d coin(s) of 1\n",coin1);
            }
        }
        else if (cash>=1) {
            int coin1=cash/1;
            System.out.printf("The %d coin(s) of 1\n",coin1);
        }
    }
}