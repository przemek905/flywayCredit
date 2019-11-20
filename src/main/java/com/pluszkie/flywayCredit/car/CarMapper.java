package com.pluszkie.flywayCredit.car;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "number"),
            @Mapping(source = "year", target = "productionYear"),
            @Mapping(source = "isCredited", target = "isTakenCreditOnIt"),
            @Mapping(source = "credit", target = "creditDetails")
    })
    CarDto carToCarDto(Car car);

    @InheritInverseConfiguration
    Car carDtoToCar(CarDto carDto);
}
