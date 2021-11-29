package creational.singleton;

public class CarPlantVolvoInUSA {

    public void createV90(){
        CarCounterSingleton counterSingleton = CarCounterSingleton.getInstance();
        counterSingleton.incrementCarCounter();
        System.out.println("Volvo V90 создан. Всего автомобилей Volvo в мире составляет: " + counterSingleton.getCarCounter());
    }

    public void createXC40(){
        CarCounterSingleton counterSingleton = CarCounterSingleton.getInstance();
        counterSingleton.incrementCarCounter();
        System.out.println("Volvo XC40 создан. Всего автомобилей Volvo в мире составляет: " + counterSingleton.getCarCounter());
    }

}
