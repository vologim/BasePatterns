package creational.abstractFactory;

import creational.abstractFactory.details.Body;
import creational.abstractFactory.details.Chassis;
import creational.abstractFactory.details.Engine;
import creational.abstractFactory.sportCar.SportCarBody;
import creational.abstractFactory.sportCar.SportCarFactory;
import creational.abstractFactory.truck.TruckBody;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new SportCarFactory();

        Body body = factory.getCarBody("sedan");
        Chassis chassis = factory.getChassis(4);
        Engine engine = factory.getEngine(420);

        System.out.println("Create sport car:");
        body.info();
        chassis.info();
        engine.info();

        System.out.println(body instanceof SportCarBody);
        System.out.println(body instanceof TruckBody);
    }
}
