package CWH.OOPaPracticeSet;

import java.util.*;

// Create a class Cylinder and use getters and setters to set its radius and height

class Cylinder{
    private int radius;
    private  int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Q1_Q2_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius and height of cylinder");
        Cylinder c1 = new Cylinder(sc.nextInt(),sc.nextInt());

        System.out.println("The surface area and volume are " + c1.surfaceArea() + " and " + c1.volume());
    }
}
