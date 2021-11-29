package creational.singleton;

public class CarCounterSingleton {
    private static CarCounterSingleton instance;
    private int counter = 0;

    private CarCounterSingleton(){

    }

    public static CarCounterSingleton getInstance(){
        if(instance == null){
            instance = new CarCounterSingleton();
        }

        return instance;
    }

    public void incrementCarCounter(){
        counter++;
    }

    public int getCarCounter(){
        return counter;
    }
}
