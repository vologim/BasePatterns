package creational.abstractFactory.truck;

import creational.abstractFactory.CarFactory;
import creational.abstractFactory.details.Body;
import creational.abstractFactory.details.Chassis;
import creational.abstractFactory.details.Engine;

public class TruckFactory implements CarFactory {
    @Override
    public Body getCarBody(String body) {
        return new TruckBody(body);
    }

    @Override
    public Chassis getChassis(int wheels) {
        return new TruckChassis(wheels);
    }

    @Override
    public Engine getEngine(int power) {
        return new TruckEngine(power);
    }
}
