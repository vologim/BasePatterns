package structural.bridge;

public class SportCar extends Car{
    public SportCar(Engine engine, Chassis chassis) {
        super(engine, chassis);
    }

    @Override
    public void getEngine() {
        System.out.println("Sport engine is power: " + engine.infoEngine());
    }

    @Override
    public void getChassis() {
        System.out.println("Sport chassis is wheels: " + chassis.infoChassis());
    }

    @Override
    void info() {
        getChassis();
        getEngine();
    }
}
