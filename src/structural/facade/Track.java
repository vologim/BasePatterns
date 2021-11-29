package structural.facade;

public class Track {

    public void start(){
        try {
            System.out.println("3");
            Thread.sleep(1000);
            System.out.println("2");
            Thread.sleep(1000);
            System.out.println("1");
            Thread.sleep(1000);
            System.out.println("Start!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop(){
        System.out.println("The race is over");
    }
}
