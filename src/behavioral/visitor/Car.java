package behavioral.visitor;

public class Car extends Auto{
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
