package com.pluszkie.flywayCredit.credit;

import com.pluszkie.flywayCredit.credit.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Long> {
}
