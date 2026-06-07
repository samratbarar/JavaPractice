package CWH.Abstract_Interfaces_PS;

/*
Create a class Telephone with ring(), lift() and disconnect() methods as
abstract methods. Create another class SmartTelephone and demonstrate polymorphism
 */

abstract class Telephone {
    void ring() {
        System.out.println("Ringing...");
    }

    void lift() {
        System.out.println("Lifting...");
    }

    abstract void disconnect();
}

class SmartPhone extends Telephone {
    public void disconnect() {
        System.out.println("Disconnecting...");
    }

    public void recordVideo() {
        System.out.println("Recording...");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Telephone tele = new SmartPhone();
        tele.ring();
        tele.lift();
        tele.disconnect();
        // tele.recordVideo(); --> cannot use
    }
}
