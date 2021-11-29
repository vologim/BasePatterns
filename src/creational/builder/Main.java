package creational.builder;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder(4, 300)
                .setBody("sedan")
                .setMusic(Music.JBL)
                .build();

        System.out.println(car);

        Car car1 = new Car.Builder(8, 300)
                .setBody("sedan")
                .setMusic(Music.JBL)
                .setTransmission(Transmission.Manual)
                .setWeight(1900)
                .build();

        System.out.println(car1);
    }
}
