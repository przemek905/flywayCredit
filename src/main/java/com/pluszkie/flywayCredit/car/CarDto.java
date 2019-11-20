package com.pluszkie.flywayCredit.car;

import com.pluszkie.flywayCredit.credit.Credit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class CarDto {
    private Long number;

    private String mark;

    private String model;

    private int productionYear;

    private Boolean isTakenCreditOnIt;

    private Credit creditDetails;
}
