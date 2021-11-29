package structural.facade.cars;

import structural.facade.Car;

public class Lada extends Car {
    @Override
    public void go() {
        System.out.println("Lada started the race");
    }

    @Override
    public void stop() {
        System.out.println("Lada stop the race");
    }
}
