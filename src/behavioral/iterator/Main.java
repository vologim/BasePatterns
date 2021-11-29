package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Volvo"), new Car("BMW"), new Car("MAZ"), new Car("Subaru")};
        Parking parking = new Parking(cars);
        Iterator<Car> iterator = parking.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getBrand());

        }
    }
}
