package structural.decorator;

public class SimpleRobotCar extends CarDecorator{
    public SimpleRobotCar(Car car) {
        super(car);
    }

    public void roboFunction(){
        System.out.println("I can fly and swim");
    }

    @Override
    public void info() {
        super.info();
        roboFunction();
    }
}
