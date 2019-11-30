package com.pluszkie.flywayCredit.car;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "cars", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CarDto addCar(@RequestBody CarDto carDto) {
        return CarMapper.INSTANCE.carToCarDto(carService.addCar(CarMapper.INSTANCE.carDtoToCar(carDto)));
    }

    @PutMapping("cars/{id}")
    CarDto editCar(@PathVariable("id") Long id, @RequestBody CarDto carDto) {
        return CarMapper.INSTANCE.carToCarDto(carService.editCar(id, CarMapper.INSTANCE.carDtoToCar(carDto)));
    }

    @DeleteMapping("cars/{id}")
    ResponseEntity deleteCar(@PathVariable("id") Long id) {
        carService.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
}
