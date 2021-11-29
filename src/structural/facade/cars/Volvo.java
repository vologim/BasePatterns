package structural.facade.cars;

import structural.facade.Car;

public class Volvo extends Car {
    @Override
    public void go() {
        System.out.println("Volvo started the race");
    }

    @Override
    public void stop() {
        System.out.println("Volvo stop the race");
    }
}
