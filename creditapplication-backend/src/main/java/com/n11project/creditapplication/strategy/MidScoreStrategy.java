package com.n11project.creditapplication.strategy;

import java.math.RoundingMode;
import liquibase.pro.packaged.B;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class MidScoreStrategy implements CalculateLimitStrategy{

    @Override
    public BigDecimal calculateLimit(BigDecimal monthlyIncome, BigDecimal assurance) {
        return new BigDecimal(20000).add(assurance.divide(new BigDecimal(5), RoundingMode.CEILING));
    }

    @Override
    public Boolean isSuitable(BigDecimal monthlyIncome, Integer creditScore) {
        return creditScore < 1000 && creditScore > 500 && monthlyIncome.compareTo(new BigDecimal(10000)) < 0 && monthlyIncome.compareTo(new BigDecimal(5000)) > 0;
    }
}
