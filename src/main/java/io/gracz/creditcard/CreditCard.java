package io.gracz.creditcard;

import io.gracz.creditcard.exeptions.CreditBelowMinimumException;

import java.math.BigDecimal;

public class CreditCard {
    private String cardNumber;
    private BigDecimal creditLimit;

    public CreditCard(String cardNumber)
    {
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal newLimit)
    {
        if(BigDecimal.valueOf(100).compareTo(newLimit)==1)
            throw new CreditBelowMinimumException();
        this.creditLimit = newLimit;
    }

    public BigDecimal getLimit()
    {
        return creditLimit;
    }


}
