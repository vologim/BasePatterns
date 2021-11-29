package behavioral.templateMethod;

public class CarWithAutoTransmis extends Car{
    @Override
    public void transmission() {
        System.out.println("set D and go");
    }
}
