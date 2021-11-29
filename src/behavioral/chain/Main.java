package behavioral.chain;

public class Main {
    public static void main(String[] args) {
        CarFactory carBody = new CarBody();
        CarFactory engine = new Engine();
        CarFactory chassis = new Chassis();

        carBody.setNext(engine);
        engine.setNext(chassis);
        carBody.create();
    }
}
