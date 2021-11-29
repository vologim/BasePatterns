package creational.abstractFactory;

import creational.abstractFactory.details.Body;
import creational.abstractFactory.details.Chassis;
import creational.abstractFactory.details.Engine;

public interface CarFactory {

    Body getCarBody(String body);
    Chassis getChassis(int wheels);
    Engine getEngine(int power);
}
