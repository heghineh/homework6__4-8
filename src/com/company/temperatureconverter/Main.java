package com.company.temperatureconverter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        //c2f
        Celsius celsius = new Celsius(10);
        Fahrenheit fahrenheit = converter.convertCtoF(celsius);
        System.out.println(celsius.getTemperature() + " C = " + fahrenheit.getTemperature() + " F:");

        //c2k
        Celsius celsius2 = new Celsius(40);
        Kelvin kelvin2 = converter.convertCtoK(celsius2);
        System.out.println(celsius2.getTemperature() + " C = " + kelvin2.getTemperature() + " K:");

        //f2c
        Fahrenheit fahrenheit1 = new Fahrenheit(212);
        Celsius celsius1 = converter.convertFtoC(fahrenheit1);
        System.out.println(fahrenheit1.getTemperature() + " F = " + celsius1.getTemperature() + " C:");

        //f2k
        Fahrenheit fahrenheit3 = new Fahrenheit(-459.67);
        Kelvin kelvin1 = converter.convertFtoK(fahrenheit3);
        System.out.println(fahrenheit3.getTemperature() + " F = " + kelvin1.getTemperature() + " K:");

        //k2f
        Kelvin kelvin = new Kelvin(283.15);
        Fahrenheit fahrenheit2 = converter.convertKtoF(kelvin);
        System.out.println(kelvin.getTemperature() + " K = " + fahrenheit2.getTemperature() + " F:");

        //k2c
        Kelvin kelvin3 = new Kelvin(273.15);
        Celsius celsius3 = converter.convertKtoC(kelvin3);
        System.out.println(kelvin3.getTemperature() + " K = " + celsius3.getTemperature() + " C:");
    }
}