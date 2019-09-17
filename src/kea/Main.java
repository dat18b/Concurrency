package kea;

public class Main {

    public static void main(String[] args) {

        Countdown c1 = new Countdown("Rocket");
        Countdown c2 = new Countdown("Car");
        Countdown c3 = new Countdown("MC");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();


        //c1.run();
        //c2.run();
        //c3.run();

    }
}
