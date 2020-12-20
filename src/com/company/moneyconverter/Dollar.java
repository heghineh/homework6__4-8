package com.company.moneyconverter;

public class Dollar {
    //region Properties
    private double currency;
    //endregion

    //region Constructors
    Dollar() {
    }

    public Dollar(double currency) {
        this.currency = currency;
    }
    //endregion

    //region Getters and Setters
    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }
    //endregion
}