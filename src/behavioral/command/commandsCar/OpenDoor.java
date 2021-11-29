package behavioral.command.commandsCar;

import behavioral.command.Car;
import behavioral.command.Command;

public class OpenDoor implements Command {
    private Car car;

    public OpenDoor(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.openDoor();
    }
}
