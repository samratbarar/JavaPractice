package CWH.OOPaPracticeSet;

import java.util.*;

// Overload a constructor used to initialize a rectangle of length
// 4 and breadth 5 for using custom parameters

class rectangle {
    private int length;
    private int breadth;

    public rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        rectangle r = new rectangle();
    }
}
