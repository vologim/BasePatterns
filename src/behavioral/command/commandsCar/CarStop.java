package behavioral.command.commandsCar;

import behavioral.command.Car;
import behavioral.command.Command;

public class CarStop implements Command {

    private Car car;

    public CarStop(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }
}
