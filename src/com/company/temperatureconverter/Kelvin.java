package com.company.temperatureconverter;

public class Kelvin {
    private double temperature;

    Kelvin() {
    }

    Kelvin(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}