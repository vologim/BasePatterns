package structural.composite;

import structural.composite.cars.BMW;
import structural.composite.cars.Kia;
import structural.composite.cars.Volvo;

public class Main {
    public static void main(String[] args) {
        Race race = new Race();

        race.addCar(new Volvo());
        race.addCar(new BMW());
        race.addCar(new Kia());

        race.race();
    }
}
