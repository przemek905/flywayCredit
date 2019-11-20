package com.pluszkie.flywayCredit.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {

    @Bean
    CarService carService(CarRepository carRepository) {
        return new CarService(carRepository);
    }
}
