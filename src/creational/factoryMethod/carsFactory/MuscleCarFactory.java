package creational.factoryMethod.carsFactory;

import creational.factoryMethod.Car;
import creational.factoryMethod.CarFactory;
import creational.factoryMethod.cars.MuscleCar;

public class MuscleCarFactory implements CarFactory {

    @Override
    public Car createCar(String brand, int maxSpeed) {
        return new MuscleCar(brand, maxSpeed);
    }
}
