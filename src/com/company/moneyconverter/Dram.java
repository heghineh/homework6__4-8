package com.company.moneyconverter;

public class Dram {
    //region Properties
    private double currency;
    //endregion

    //region Constructors
    Dram() {
    }

    public Dram(double currency) {
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