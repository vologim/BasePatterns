package creational.singleton;

public class CarPlantVolvoInRussia {

    public void createXC90(){
        CarCounterSingleton counterSingleton = CarCounterSingleton.getInstance();
        counterSingleton.incrementCarCounter();
        System.out.println("Volvo XC90 создан. Всего автомобилей Volvo в мире составляет: " + counterSingleton.getCarCounter());
    }

    public void createS90(){
        CarCounterSingleton counterSingleton = CarCounterSingleton.getInstance();
        counterSingleton.incrementCarCounter();
        System.out.println("Volvo S90 создан. Всего автомобилей Volvo в мире составляет: " + counterSingleton.getCarCounter());
    }

}
