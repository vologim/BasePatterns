package behavioral.command.commandsCar;

import behavioral.command.Car;
import behavioral.command.Command;

public class CloseDoor implements Command {
    private Car car;

    public CloseDoor(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.closeDoor();
    }
}
