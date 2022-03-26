package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        return (CurrencyType.UNIVERSAL_CURRENCY.getRate()/(this.getCurrencyType().getRate() ))
                *(currencyType.getRate()/CurrencyType.UNIVERSAL_CURRENCY.getRate());
    }
    CurrencyType getCurrencyType();
}
