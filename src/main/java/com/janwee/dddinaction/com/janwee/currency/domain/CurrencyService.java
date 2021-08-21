package com.janwee.dddinaction.com.janwee.currency.domain;

//通过领域服务获取值对象
public class CurrencyService {
    private final CurrencyRepository currencyRepo;

    public CurrencyService(CurrencyRepository currencyRepo) {
        this.currencyRepo = currencyRepo;
    }

    public CurrencyType typeOfSymbol(String symbol) {
        return currencyRepo.typeOfSymbol(symbol);
    }
}