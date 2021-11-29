package behavioral.visitor;

public class AutoVisitor implements Visitor{
    @Override
    public void visit(Car car) {
        System.out.println("This is a car: " + car.getBrand());
    }

    @Override
    public void visit(Track track) {
        System.out.println("This is a track: " + track.getBrand());
    }
}
