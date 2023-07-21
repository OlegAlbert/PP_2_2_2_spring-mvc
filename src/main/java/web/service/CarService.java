package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getNumberOfCarsFromList(List<Car> cars, Integer count);
}
