package creational.factoryMethod.carsFactory;

import creational.factoryMethod.Car;
import creational.factoryMethod.CarFactory;
import creational.factoryMethod.cars.SportCar;

public class SportCarFactory implements CarFactory {

    @Override
    public Car createCar(String brand, int maxSpeed) {
        return new SportCar(brand, maxSpeed);
    }
}
