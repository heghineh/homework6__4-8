package com.company.temperatureconverter;

public class Fahrenheit {
    private double temperature;

    Fahrenheit() {
    }

    Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}