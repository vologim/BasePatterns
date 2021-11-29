package behavioral.chain;

public interface CarFactory {
    void setNext(CarFactory factory);
    void create();
}
