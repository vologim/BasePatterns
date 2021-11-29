package creational.abstractFactory.moto;

import creational.abstractFactory.CarFactory;
import creational.abstractFactory.details.Body;
import creational.abstractFactory.details.Chassis;
import creational.abstractFactory.details.Engine;

public class MotoFactory implements CarFactory {

    @Override
    public Body getCarBody(String body) {
        return new MotoBody(body);
    }

    @Override
    public Chassis getChassis(int wheels) {
        return new MotoChassis(wheels);
    }

    @Override
    public Engine getEngine(int power) {
        return new MotoEngine(power);
    }
}
