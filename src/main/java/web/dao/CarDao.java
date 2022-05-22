package web.dao;

import java.util.List;
import java.util.ArrayList;
import web.model.Car;

public class CarDao {

    private List<Car> cars;

    public CarDao() {
        cars = new ArrayList<>();
        cars.add(new Car("KIA", "Rio", 2020));
        cars.add(new Car("Toyota", "Corolla", 2019));
        cars.add(new Car("Nissan", "Quashqai", 2022));
        cars.add(new Car("Hyundai", "Solaris", 2018));
        cars.add(new Car("Ford", "Focus", 2014));
    }

    public List<Car> returnCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        } else {
            List<Car> someCars = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                someCars.add(cars.get(i));
            }
            return someCars;
        }
    }
}
