package com.pluszkie.flywayCredit.car;

import org.hibernate.HibernateException;

import java.util.Collections;
import java.util.List;

class CarService {
    private CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    List<Car> getCars() {
        return carRepository.findAll();
    }

    Car addCar(Car car) {
        return carRepository.save(car);
    }

    Car editCar(Long id, Car car) {
        Car findCar =
                carRepository.findAllById(Collections.singleton(id)).stream()
                        .findFirst()
                        .orElseThrow(() -> new HibernateException(String.format("Car with id: %d doesn't exist.", id)));
        findCar.updateValues(car);
        return carRepository.save(findCar);
    }

    void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}
