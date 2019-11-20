package com.pluszkie.flywayCredit.car;

import com.pluszkie.flywayCredit.credit.Credit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
class Car {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "year")
    private int year;

    @Column(name = "isCredited")
    private Boolean isCredited;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_car_id")
    private Credit credit;
}
