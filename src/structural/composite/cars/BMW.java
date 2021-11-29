package structural.composite.cars;

import structural.composite.Car;

public class BMW implements Car {
    @Override
    public void go() {
        System.out.println("BMW is start");
    }
}
