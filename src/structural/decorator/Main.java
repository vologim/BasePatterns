package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car car1 = new SimpleCar();
        car1.info();
        System.out.println("==============================");
        Car car2 = new SimpleRobotCar(car1);
        car2.info();
        System.out.println("==============================");
        Car car3 = new FastCar(car1);
        car3.info();
        System.out.println("==============================");
        Car car4 = new FastCar(car2);
        car4.info();
    }
}
