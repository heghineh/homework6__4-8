package com.company.moneyconverter;

public class Ruble {
    //region Properties
    private double currency;
    //endregion

    //region Constructors
    Ruble() {
    }

    public Ruble(double currency) {
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