package com.pluszkie.flywayCredit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car")
public class Car {
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
    private boolean isCredited;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_car_id")
    private Credit credit;
}
