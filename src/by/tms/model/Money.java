package by.tms.model;

import java.math.BigDecimal;
import java.util.Currency;

public class Money {

    private final Currency currency;

    private final BigDecimal sellPrice;

    private final BigDecimal buyPrice;

    public Money(Currency currency, BigDecimal sellPrice, BigDecimal buyPrice) {
        if ((currency==null) || (sellPrice.compareTo(BigDecimal.ZERO) <=0)
                || (buyPrice.compareTo(BigDecimal.ZERO)<=0)) {
            throw new IllegalArgumentException();

        }
        this.currency = currency;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }
}
