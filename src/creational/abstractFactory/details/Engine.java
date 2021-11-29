package creational.abstractFactory.details;

public abstract class Engine {

    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public void info() {
        System.out.println("Power is " + power);
    }
}
