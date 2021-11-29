package structural.decorator;

public class SimpleCar implements Car{
    @Override
    public void info() {
        System.out.println("Simple car. Max speed 170");
    }
}
