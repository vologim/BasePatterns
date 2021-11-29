package creational.abstractFactory.sportCar;

import creational.abstractFactory.CarFactory;
import creational.abstractFactory.details.Body;
import creational.abstractFactory.details.Chassis;
import creational.abstractFactory.details.Engine;

public class SportCarFactory implements CarFactory {
    @Override
    public Body getCarBody(String body) {
        return new SportCarBody(body);
    }

    @Override
    public Chassis getChassis(int wheels) {
        return new SportCarChassis(wheels);
    }

    @Override
    public Engine getEngine(int power) {
        return new SportCarEngine(power);
    }
}
