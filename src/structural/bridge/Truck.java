package structural.bridge;

public class Truck extends Car{
    public Truck(Engine engine, Chassis chassis) {
        super(engine, chassis);
    }

    @Override
    public void getEngine() {
        System.out.println("Truck engine is power: " + engine.infoEngine());
    }

    @Override
    public void getChassis() {
        System.out.println("Truck chassis is wheels: " + chassis.infoChassis());
    }

    @Override
    void info() {
        getEngine();
        getChassis();
    }
}
