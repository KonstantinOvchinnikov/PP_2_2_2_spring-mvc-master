package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

@Controller
public class CarController {
    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String ShowCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("list", carService.getRequiredNumbersOfObjects(count));
        return "cars";
    }
}
