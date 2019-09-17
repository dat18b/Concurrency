package kea.CarRace;

import java.util.Random;

public class Car implements Runnable{

    private String name;
    //private int bhp;
    private Random r = new Random();
    private int time;


    public Car(String name, int bhp) {
        this.name = name;
        time = r.nextInt(999) + bhp;
    }

    public Car() {

    }

    public void run(){

        for(int i = 5; i >= 0 ; i--){
            try {
                System.out.println(name);
                Thread.sleep(time);

                if(i <= 0){
                    System.out.println(name + "GOAL!");
                }
            } catch (InterruptedException e) {
                System.out.println("I WAS STOPPED BY YOU!! " + e);
                System.exit(1);

            }
        }

    }

    public void countDown(){

    }



}
