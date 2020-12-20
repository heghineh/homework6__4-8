package com.company.temperatureconverter;

public class Celsius {
    private double temperature;

    Celsius() {
    }

    Celsius(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}