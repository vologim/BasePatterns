package behavioral.command;

public class Driver {
    private Command start;
    private Command stop;
    private Command openDoor;
    private Command closeDoor;

    public Driver(Command start, Command stop, Command openDoor, Command closeDoor) {
        this.start = start;
        this.stop = stop;
        this.openDoor = openDoor;
        this.closeDoor = closeDoor;
    }

    public void start(){
        start.execute();
    }

    public void stop(){
        stop.execute();
    }

    public void openDoor(){
        openDoor.execute();
    }

    public void closeDoor(){
        closeDoor.execute();
    }
}
