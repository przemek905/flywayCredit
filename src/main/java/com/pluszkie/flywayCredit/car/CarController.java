package com.pluszkie.flywayCredit.car;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
public class CarController {

    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "cars", produces = MediaType.APPLICATION_JSON_VALUE)
    List<CarDto> getAllCars() {
        return carService.getCars().stream()
                .map(CarMapper.INSTANCE::carToCarDto)
                .collect(Collectors.toList());
    }
}
