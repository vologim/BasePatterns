package structural.bridge;

import structural.bridge.chassisImpl.SportChassis;
import structural.bridge.chassisImpl.TruckChassis;
import structural.bridge.engineImpl.SportEngine;
import structural.bridge.engineImpl.TruckEngine;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine(), new SportChassis());
        sportCar.info();

        Car truck = new Truck(new TruckEngine(), new TruckChassis());
        truck.info();
    }
}
