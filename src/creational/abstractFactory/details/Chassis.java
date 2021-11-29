package creational.abstractFactory.details;

public abstract class Chassis {

    private int wheels;

    public Chassis(int wheels) {
        this.wheels = wheels;
    }

    public void info() {
        System.out.println("Wheels is " + wheels);
    }
}
