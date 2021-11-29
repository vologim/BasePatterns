package structural.bridge.chassisImpl;

import structural.bridge.Chassis;

public class TruckChassis implements Chassis {
    private int wheels = 10;

    @Override
    public int infoChassis() {
        return wheels;
    }
}
