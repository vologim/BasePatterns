package structural.decorator;

public class FastCar extends CarDecorator{
    public FastCar(Car car) {
        super(car);
    }

    public void acceleration(){
        System.out.println("Acceleration. Max speed 500");
    }

    @Override
    public void info() {
        super.info();
        acceleration();
    }
}
