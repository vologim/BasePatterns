package structural.composite.cars;

import structural.composite.Car;

public class Volvo implements Car {
    @Override
    public void go() {
        System.out.println("Volvo is start");
    }
}
