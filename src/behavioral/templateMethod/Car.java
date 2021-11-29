package behavioral.templateMethod;

public abstract class Car {
    public void drive(){
        System.out.println("Car start");
        transmission();
        System.out.println("Car stop");
    }

    public abstract void transmission();
}
