package behavioral.command.commandsCar;

import behavioral.command.Car;
import behavioral.command.Command;

public class CarStart implements Command {

    private Car car;

    public CarStart(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.start();
    }
}
