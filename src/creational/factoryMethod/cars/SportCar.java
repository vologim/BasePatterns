package creational.factoryMethod.cars;

import creational.factoryMethod.Car;

public class SportCar extends Car {
    public SportCar(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public void info() {
        System.out.println("I'm sport car. My brand's " + getBrand() + " and my max speed's " + getMaxSpeed());
    }
}
