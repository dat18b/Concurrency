package kea.CarRace;

import java.util.Scanner;

public class GTA {

    public static void main(String[] args) throws InterruptedException {
        Thread car1 = new Thread(new Car("BMW", 30));
        Thread car2 = new Thread(new Car("Toyota", 100));

        RunAdministration ra = new RunAdministration();
        ra.countDown();

        car1.start();
        car2.start();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while(true){

            if(!car1.isAlive() && !car2.isAlive()){
                System.exit(0);
            }


            input= scanner.next();
            if (input.equals("q") && car1.isAlive()){
                car1.interrupt();
            }



        }




    }
}
