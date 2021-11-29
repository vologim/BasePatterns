package structural.facade;

import structural.facade.cars.BMW;
import structural.facade.cars.Lada;
import structural.facade.cars.Volvo;

import java.util.List;

public class RaceFacade {
    private List<Car> cars = List.of(new BMW(), new Lada(), new Volvo());
    private CarSupport carSupport = new CarSupport();
    private Track track = new Track();

    public void startRace(){
        carSupport.refuelingCars();
        track.start();
        cars.stream().forEach(Car::go);
    }

    public void stopRace(){
        cars.stream().forEach(Car::stop);
        track.stop();
    }
}
