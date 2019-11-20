package com.pluszkie.flywayCredit.repo;

import com.pluszkie.flywayCredit.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
