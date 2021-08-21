package com.janwee.dddinaction.com.janwee.currency.domain;

//货币类型值对象仓库
public interface CurrencyRepository {
    CurrencyType typeOfSymbol(String symbol);
}
