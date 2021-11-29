package creational.builder;

public class Car {
    private int wheels;
    private int power;

    private Music music;
    private String color;
    private int weight;
    private String body;
    private Transmission transmission;

    public static class Builder {
        Car car = new Car();

        public Builder(int wheels, int power){
            car.wheels = wheels;
            car.power = power;
        }

        public Builder setMusic(Music music){
            car.music = music;
            return this;
        }

        public Builder setColor(String color){
            car.color = color;
            return this;
        }

        public Builder setWeight(int weight){
            car.weight = weight;
            return this;
        }

        public Builder setBody(String body){
            car.body = body;
            return this;
        }

        public Builder setTransmission(Transmission transmission){
            car.transmission = transmission;
            return this;
        }

        public Car build(){
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", power=" + power +
                ", music=" + music +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", body='" + body + '\'' +
                ", transmission=" + transmission +
                '}';
    }
}
