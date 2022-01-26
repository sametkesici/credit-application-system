package com.n11project.creditapplication.strategy;

import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class RejectStrategy implements CalculateLimitStrategy{

    @Override
    public Double calculateLimit(Double monthlyIncome, Double assurance) {
        return 0.0;
    }

    @Override
    public Boolean isSuitable(Double monthlyIncome, Integer creditScore) {
        return creditScore < 500 ;
    }
}
