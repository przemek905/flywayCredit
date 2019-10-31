package com.pluszkie.flywayCredit.repo;

import com.pluszkie.flywayCredit.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit, Long> {
}
