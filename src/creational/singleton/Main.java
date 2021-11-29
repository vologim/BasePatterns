package creational.singleton;

public class Main {
    public static void main(String[] args) {
        CarPlantVolvoInRussia volvoInRussia = new CarPlantVolvoInRussia();
        CarPlantVolvoInUSA volvoInUSA = new CarPlantVolvoInUSA();

        volvoInRussia.createS90();
        volvoInRussia.createS90();
        volvoInRussia.createXC90();
        volvoInUSA.createV90();
        volvoInUSA.createXC40();
    }
}
