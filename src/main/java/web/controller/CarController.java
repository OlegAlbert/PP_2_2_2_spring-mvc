package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 12, "Red"));
        cars.add(new Car("Hyundai", 34, "Blue"));
        cars.add(new Car("Audi", 56, "Yellow"));
        cars.add(new Car("Toyota", 78, "Black"));
        cars.add(new Car("Volga", 90, "White"));

        model.addAttribute("cars", carService.getNumberOfCarsFromList(cars, count));
        return "cars";
    }
}
