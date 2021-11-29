package creational.factoryMethod.carsFactory;

import creational.factoryMethod.Car;
import creational.factoryMethod.CarFactory;
import creational.factoryMethod.cars.Buggy;

public class BuggyFactory implements CarFactory {

    @Override
    public Car createCar(String brand, int maxSpeed) {
        return new Buggy(brand, maxSpeed);
    }
}
