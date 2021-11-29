package structural.bridge;

public abstract class Car {
    protected Engine engine;
    protected Chassis chassis;

    public Car(Engine engine, Chassis chassis) {
        this.engine = engine;
        this.chassis = chassis;
    }

    abstract public void getEngine();
    abstract public void getChassis();
    abstract void info();
}
