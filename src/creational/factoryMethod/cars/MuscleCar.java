package creational.factoryMethod.cars;

import creational.factoryMethod.Car;

public class MuscleCar extends Car {
    public MuscleCar(String brand, int maxSpeed) {
        super(brand, maxSpeed);
    }

    @Override
    public void info() {
        System.out.println("I'm muscle car. My brand's " + getBrand() + " and my max speed's " + getMaxSpeed());
    }
}
