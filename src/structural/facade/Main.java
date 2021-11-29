package structural.facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RaceFacade raceFacade = new RaceFacade();
        raceFacade.startRace();
        Thread.sleep(2000);
        raceFacade.stopRace();
    }
}
