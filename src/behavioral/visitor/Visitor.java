package behavioral.visitor;

public interface Visitor {
    void visit(Car car);
    void visit(Track track);
}
