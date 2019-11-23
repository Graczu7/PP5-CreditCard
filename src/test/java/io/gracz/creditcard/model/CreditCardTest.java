package io.gracz.creditcard.model;

import io.gracz.creditcard.CreditCard;
import io.gracz.creditcard.exeptions.CreditBelowMinimumException;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    public static final int NEW_CREDIT_LIMIT = 2000;


    @Test
    public void itAllowAssignLimitToCreditCard()
    {
        CreditCard card = new CreditCard("1412-1231");

        card.assignLimit(BigDecimal.valueOf(NEW_CREDIT_LIMIT));
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(NEW_CREDIT_LIMIT)));
    }

    @Test
    public void itVerifyMinimumCredit()
    {
        CreditCard card = new CreditCard("1412-1231");

        try
        {
            card.assignLimit(BigDecimal.valueOf(50));
            Assert.fail("Exception should be thrown");
        }
        catch(CreditBelowMinimumException e)
        {
            Assert.assertTrue(true);
        }
    }
}
