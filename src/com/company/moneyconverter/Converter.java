package com.company.moneyconverter;

public class Converter {
    public Ruble convertDramToRuble(Dram dram) {
        Ruble ruble = new Ruble(dram.getCurrency() * 0.15);
        return ruble;
    }

    public Dollar convertDramToDollar(Dram dram) {
        Dollar dollar = new Dollar(dram.getCurrency() * 0.0021);
        return dollar;
    }

    public Ruble convertDollarToRuble(Dollar dollar) {
        Ruble ruble = new Ruble(dollar.getCurrency() * 73.43);
        return ruble;
    }

    public Dram convertDollarToDram(Dollar dollar) {
        Dram dram = new Dram(dollar.getCurrency() * 522.23);
        return dram;
    }

    public Dram convertRubleToDram(Ruble ruble) {
        Dram dram = new Dram(ruble.getCurrency() * 7.11);
        return dram;
    }

    public Dollar convertRubleToDollar(Ruble ruble) {
        Dollar dollar = new Dollar(ruble.getCurrency() * 0.014);
        return dollar;
    }
}