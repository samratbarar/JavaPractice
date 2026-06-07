package CWH.Abstract_Interfaces_PS;

/*
Create an Interface TvRemote and use it to inherit another Interface SmartTvRemote.
Create a class Tv which implements TvRemote interface
 */

interface TvRemote {
    void changeChannel();
    void increaseVol();
    void decreaseVol();
    default void switchOnTv() {
        System.out.println("Switching on.... Tv");
    }
}

interface SmartTvRemote extends TvRemote {
    void voiceCommand();
}

class Tv implements TvRemote {
    public void changeChannel() {
        System.out.println("Changing... channel");
    }

    public void increaseVol() {
        System.out.println("Increasing... Volume");
    }

    public void decreaseVol() {
        System.out.println("Decreasing... Volume");
    }
}

public class Q6_Q7 {
    public static void main(String[] args) {
        Tv tv = new Tv();

        tv.switchOnTv();
        tv.changeChannel();
        tv.increaseVol();
        tv.decreaseVol();
    }
}
