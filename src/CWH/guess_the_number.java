package CWH;

import java.util.*;

/*
Create a class CWH.Game, which allows a user to play "Guess the Number"
game once. CWH.Game should have the following methods :
1. Constructor to generate the random number
2. takeUserInput() to take a user input of number
3. isCorrectNumber() to detect whether the number entered by the user is true
4. getter and setter for noOfGuesses
Use properties such as noOfGuesses(int), etc to get this task done!
 */

class Game{
    private int ranNum;
    private int userNum;
    private int noOfGuesses;

    public Game() {
        Random ran = new Random();
       ranNum = ran.nextInt(101);
    }

    public void takeUserInput(int userInput) {
        userNum = userInput;
    }

    public boolean isCorrectNumber() {
//        if (userNum == ranNum) {
//            return true;
//        } else {
//            return false;
//        } ---> my logic but optimised by
        return userNum == ranNum;
    }

    public void incrementNoOfGuesses() {
        noOfGuesses++;
    }

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void guessTheNumber() {
        if (userNum > ranNum) {
            System.out.println("Entered number is greater");
        } else if (userNum < ranNum) {
            System.out.println("Entered number is smaller");
        } else {
            System.out.println("Entered number is correct");
        }
    }
}

public class guess_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Game GuessTheNumber = new Game();

        do {
            System.out.println("Guess the number ");
            GuessTheNumber.takeUserInput(sc.nextInt());
            GuessTheNumber.guessTheNumber();
            GuessTheNumber.incrementNoOfGuesses();
        } while (!GuessTheNumber.isCorrectNumber());

        System.out.println("The number of guesses is " + GuessTheNumber.getNoOfGuesses());
    }
}