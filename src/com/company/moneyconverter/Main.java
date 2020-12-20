package com.company.moneyconverter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        //convertDramToRuble
        Dram dram = new Dram(1000);
        Ruble ruble = converter.convertDramToRuble(dram);
        System.out.println(dram.getCurrency() + " Dram = " + ruble.getCurrency() + " Ruble");

        //convertDramToDollar
        Dram dram1 = new Dram(1000);
        Dollar dollar = converter.convertDramToDollar(dram1);
        System.out.println(dram1.getCurrency() + " Dram = " + dollar.getCurrency() + " Dollar");

        //convertDollarToRuble
        Dollar dollar1 = new Dollar(200);
        Ruble ruble1 = converter.convertDollarToRuble(dollar1);
        System.out.println(dollar1.getCurrency() + " Dollar = " + ruble1.getCurrency() + " Ruble");

        //convertDollarToDram
        Dollar dollar2 = new Dollar(300);
        Dram dram2 = converter.convertDollarToDram(dollar2);
        System.out.println(dollar2.getCurrency() + " Dollar = " + dram2.getCurrency() + " Dram");

        //convertRubleToDram
        Ruble ruble2 = new Ruble(10);
        Dram dram3 = converter.convertRubleToDram(ruble2);
        System.out.println(ruble2.getCurrency() + " Ruble = " + dram3.getCurrency() + " Dram");

        //convertRubleToDollar
        Ruble ruble3 = new Ruble(20);
        Dollar dollar3 = converter.convertRubleToDollar(ruble3);
        System.out.println(ruble3.getCurrency() + " Ruble = " + dollar3.getCurrency() + " Dollar");
    }
}