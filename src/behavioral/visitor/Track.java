package behavioral.visitor;

public class Track extends Auto{
    public Track(String brand) {
        super(brand);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
