package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarServiceImp carServiceImp;

    @GetMapping(value = "/cars")
    public String ShowCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars", carServiceImp.getRequiredNumbersOfObjects(count));
        return "cars";
    }
}
