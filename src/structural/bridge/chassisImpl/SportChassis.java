package structural.bridge.chassisImpl;

import structural.bridge.Chassis;

public class SportChassis implements Chassis {
    private int wheels = 4;

    @Override
    public int infoChassis() {
        return wheels;
    }
}
