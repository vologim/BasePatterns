package behavioral.command;

import behavioral.command.commandsCar.CarStart;
import behavioral.command.commandsCar.CarStop;
import behavioral.command.commandsCar.CloseDoor;
import behavioral.command.commandsCar.OpenDoor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Driver driver = new Driver(
                new CarStart(car),
                new CarStop(car),
                new OpenDoor(car),
                new CloseDoor(car)
        );

        driver.openDoor();
        driver.closeDoor();
        driver.start();
        driver.stop();
    }
}
