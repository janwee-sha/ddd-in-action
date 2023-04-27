package com.janwee.dddinaction.currency.domain;

//货币类型值对象仓库
public interface CurrencyRepository {
    CurrencyType typeOfSymbol(String symbol);
}
