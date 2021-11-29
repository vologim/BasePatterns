package behavioral.chain;

public class Chassis implements CarFactory{
    private CarFactory next;

    @Override
    public void setNext(CarFactory factory) {
        this.next = factory;
    }

    @Override
    public void create() {
        if(next != null){
            next.create();
        }
        System.out.println("Chassis is created");
    }
}
