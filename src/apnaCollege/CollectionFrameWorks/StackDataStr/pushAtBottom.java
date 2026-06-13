package apnaCollege.CollectionFrameWorks.StackDataStr;

import java.util.*;

public class pushAtBottom {
    public static void pushingAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushingAtBottom(data, s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushingAtBottom(4,s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
