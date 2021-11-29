package creational.factoryMethod.cars;

import creational.factoryMethod.Car;

public class Buggy extends Car {
    public Buggy(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public void info() {
        System.out.println("I'm buggy car. My brand's " + getBrand() + " and my max speed's " + getMaxSpeed());
    }

}
