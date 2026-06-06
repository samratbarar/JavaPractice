package CWH.OOPaPracticeSet;

import java.util.*;

// Create a class Sphere and use getters and setters to set its radius

class Sphere{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of sphere ");
        Sphere s1 = new Sphere(sc.nextInt());

        System.out.println("The surface area and volume are " + s1.surfaceArea() + " and " + s1.volume());
    }
}
