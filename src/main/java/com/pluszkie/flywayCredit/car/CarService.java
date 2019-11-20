package com.pluszkie.flywayCredit.car;

import java.util.List;

class CarService {
    private CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    List<Car> getCars() {
        return carRepository.findAll();
    }
}
