package com.company.temperatureconverter;

public class Converter {

    //c2f
    public Fahrenheit convertCtoF(Celsius celsius) {
        Fahrenheit fahrenheit = new Fahrenheit(9 * celsius.getTemperature() / 5 + 32);
        return fahrenheit;
    }

    //c2k
    public Kelvin convertCtoK(Celsius celsius) {
        Kelvin kelvin = new Kelvin(celsius.getTemperature() + 273.15);
        return kelvin;
    }

    //f2c
    public Celsius convertFtoC(Fahrenheit fahrenheit) {
        Celsius celsius = new Celsius(5 * (fahrenheit.getTemperature() - 32) / 9);
        return celsius;
    }

    //f2k
    public Kelvin convertFtoK(Fahrenheit fahrenheit) {
        Kelvin kelvin = new Kelvin(5 * (fahrenheit.getTemperature() + 459.67) / 9);
        return kelvin;
    }

    //k2f
    public Fahrenheit convertKtoF(Kelvin kelvin) {
        Fahrenheit fahrenheit = new Fahrenheit(9 * (kelvin.getTemperature()) / 5 - 459.67);
        return fahrenheit;
    }

    //k2c
    public Celsius convertKtoC(Kelvin kelvin) {
        Celsius celsius = new Celsius(kelvin.getTemperature() - 273.15);
        return celsius;
    }
}