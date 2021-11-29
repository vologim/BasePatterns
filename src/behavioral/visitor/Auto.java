package behavioral.visitor;

public abstract class Auto {
    private String brand;

    public Auto(String brand) {
        this.brand = brand;
    }

    public abstract void accept(Visitor visitor);

    public String getBrand() {
        return brand;
    }
}
