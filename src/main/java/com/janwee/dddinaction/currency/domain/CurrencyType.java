package com.janwee.dddinaction.currency.domain;

import java.util.Objects;

//货币类型值对象
public final class CurrencyType {
    private final String symbol;
    private final String name;

    public CurrencyType(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyType that = (CurrencyType) o;
        return symbol.equals(that.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol);
    }
}
