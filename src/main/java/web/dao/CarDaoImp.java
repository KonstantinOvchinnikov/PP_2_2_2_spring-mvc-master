package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    private List<Car> cars = List.of(new Car[]{
            new Car("BMW", "x5", "e53"),
            new Car("Nissan", "X-trail", "t31"),
            new Car("Lada", "niva", "travel"),
            new Car("Volvo", "xc90", "II"),
            new Car("Mazda", "B2500", "B-series")
    });

    public List<Car> getRequiredNumbersOfObjects(int count) {
        return (count >= 5) ? this.cars : this.cars.subList(0, count);
    }
}
