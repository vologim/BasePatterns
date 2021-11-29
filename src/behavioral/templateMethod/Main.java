package behavioral.templateMethod;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarWithAutoTransmis();
        Car car2 = new CarWithManualTransmis();

        car1.drive();
        car2.drive();
    }

}
