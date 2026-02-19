class S {
    int side;
    public int area() {
        return side * side ;
    }
    public int peri() {
        return 4 * side;
    }
}
public class Square {
    public static void main(String[] args) {
        S s = new S();
        s.side = 6;
        System.out.println(s.side);
        System.out.println(s.area());
        System.out.println(s.peri());
    }
}
