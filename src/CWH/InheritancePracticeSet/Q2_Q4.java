package CWH.InheritancePracticeSet;

import java.util.*;

// Create a class Rectangle and use inheritance to create another
// cuboid. try to keep it as close to real world scenario as possible
// Create methods for area and volume and also getter setter

class Rectangle {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length*breadth;
    }

    public int peri() {
        return 2 * (length+breadth);
    }
}

class Cuboid extends Rectangle{
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Cuboid(int l, int b, int w) {
        super(l, b);
        this.width = w;
    }

    public int volume() {
        return super.area() * width;
    }

    public int surfaceArea() {
        return 2 * (getLength()*getBreadth() + getBreadth()*width + getLength()*width);
    }
}
public class Q2_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length, breadth and height of cuboid");
        Cuboid C = new Cuboid(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Area of rectangle = " + C.area());
        System.out.println("Perimeter of rectangle = " + C.peri());
        System.out.println("Volume of cuboid = " + C.volume());
        System.out.println("Surface Area of cuboid = " + C.surfaceArea());
    }
}
