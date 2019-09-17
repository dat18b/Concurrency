package kea;

public class Countdown implements Runnable {

    private String name;

    public Countdown(String name) {
        this.name = name;
    }
    @Override
    public void run() {

        for(int i = 5; i > 0; i--){
            System.out.println(name + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted " + e);
                System.exit(1);
            }
        }
    }
}
