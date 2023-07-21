package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getNumberOfCarsFromList(List<Car> cars, Integer count) {
        if (count == null || count > 5) {
            count = 5;
        } else if (count < 0) {
            count = 0;
        }
        return cars.subList(0, count);
    }
}
