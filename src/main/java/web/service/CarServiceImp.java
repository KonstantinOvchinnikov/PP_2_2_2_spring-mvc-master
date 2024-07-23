package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    @Autowired
    CarDao carDao;

    public List<Car> getRequiredNumbersOfObjects(int count) {
        return carDao.getRequiredNumbersOfObjects(count);
    }
}
