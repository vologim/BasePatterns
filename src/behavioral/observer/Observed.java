package behavioral.observer;

public interface Observed<T> {
    void addObserve(Observer<T> observer);
    void deleteObserve(Observer<T> observer);
    void notifyObserves();
}
