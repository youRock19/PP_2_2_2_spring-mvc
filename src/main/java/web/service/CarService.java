package web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

@Component
public class CarService {

    CarDao carDao = new CarDao();

    public List<Car> returnCars(Integer count) {
        return carDao.returnCars(count);
    }
}
