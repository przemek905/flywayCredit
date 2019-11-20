package com.pluszkie.flywayCredit.car;

import com.pluszkie.flywayCredit.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends JpaRepository<Car, Long> {
}
