package structural.facade.cars;

import structural.facade.Car;

public class BMW extends Car {
    @Override
    public void go() {
        System.out.println("BMW started the race");
    }

    @Override
    public void stop() {
        System.out.println("BMW stop the race");
    }
}
