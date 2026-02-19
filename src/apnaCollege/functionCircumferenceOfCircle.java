package apnaCollege;

import java.util.*;

/*
Write a function that takes in the radius as input and returns the
circumference of a circle.
 */

public class functionCircumferenceOfCircle {
    public static float circumferenceOfCircle(float r) {
        return (2*3.14159265359f*r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        float radius = sc.nextInt();

        System.out.println("The Circumference of the circle is " + circumferenceOfCircle(radius));
    }
}
