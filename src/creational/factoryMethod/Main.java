package creational.factoryMethod;

import creational.factoryMethod.carsFactory.BuggyFactory;
import creational.factoryMethod.carsFactory.MuscleCarFactory;
import creational.factoryMethod.carsFactory.SportCarFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = createNewCar("buggy");
        Car car = factory.createCar("Audi", 123);

        car.info();
    }

    static CarFactory createNewCar(String typeCar){
        if(typeCar.equalsIgnoreCase("sportCar")){
            return new SportCarFactory();
        }
        else if(typeCar.equalsIgnoreCase("muscleCar")){
            return new MuscleCarFactory();
        }
        else if(typeCar.equalsIgnoreCase("buggy")){
            return new BuggyFactory();
        }
        else {
            throw new RuntimeException(typeCar + " is unknown type car");
        }
    }
}
