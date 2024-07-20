package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.ServiceImp;

import java.util.List;

@Controller
public class CarController {
    List<Car> cars = List.of(new Car[]{
            new Car("BMW", "x5", "e53"),
            new Car("Nissan", "X-trail", "t31"),
            new Car("Lada", "niva", "travel"),
            new Car("Volvo", "xc90", "II"),
            new Car("Mazda", "B2500", "B-series")
    });

    @GetMapping(value = "/cars")
    public String ShowCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", ServiceImp.getRequiredNumbersOfObjects(cars, count));
        return "cars";
    }
}
