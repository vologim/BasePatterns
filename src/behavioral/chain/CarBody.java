package behavioral.chain;

public class CarBody implements CarFactory{
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
        System.out.println("Car body is created");
    }
}
