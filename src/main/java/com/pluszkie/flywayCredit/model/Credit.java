package com.pluszkie.flywayCredit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "amount")
    private String amount;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Persons_Credits",
            joinColumns = {@JoinColumn(name = "credit_id")},
            inverseJoinColumns = {@JoinColumn(name = "person_id")}
    )
    private Set<Person> persons;
}
