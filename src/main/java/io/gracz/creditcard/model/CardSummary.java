package io.gracz.creditcard.model;

import java.math.BigDecimal;

public class CardSummary {
    public String number;
    public BigDecimal balance;

    public CardSummary(String number, BigDecimal balance) {
        this.number = number;
        this.balance = balance;
    }
}
