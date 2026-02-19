class cell {
    public void f(){
        System.out.println("Ringing");
        System.out.println("vibrating");
    }
}
public class cellphone {
    public static void main(String[] args) {
        cell c = new cell();
        c.f();
    }
}
