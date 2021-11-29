package creational.factoryMethod;

public abstract class Car {
    private String brand;
    private int maxSpeed;

    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public abstract void info();

    public String getBrand(){
        return brand;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
}
