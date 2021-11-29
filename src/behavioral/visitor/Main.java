package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Car("Tesla");
        Auto auto2 = new Car("BMW");
        Auto auto3 = new Track("Volvo");
        Auto auto4 = new Track("MAZ");

        Visitor visitor = new AutoVisitor();

        auto1.accept(visitor);
        auto2.accept(visitor);
        auto3.accept(visitor);
        auto4.accept(visitor);
    }
}
