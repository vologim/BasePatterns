package behavioral.iterator;

public class Parking{
    private Car[] cars;
    private Iterator<Car> iterator;

    public Parking(Car[] cars) {
        this.cars = cars;
        iterator = new CarIterator();
    }

    public Iterator<Car> getIterator() {
        return iterator;
    }

    private class CarIterator implements Iterator<Car>{
        int index;

        @Override
        public boolean hasNext() {
            if(index < cars.length){
                return true;
            }
            return false;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
