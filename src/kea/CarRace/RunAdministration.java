package kea.CarRace;

public class RunAdministration {

    public void countDown() throws InterruptedException {
        for (int i = 5; i > 0 ; i--){

            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
