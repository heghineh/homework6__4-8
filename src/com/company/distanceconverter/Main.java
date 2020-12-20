package com.company.distanceconverter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();

        //meters2miles
        Meter meter = new Meter(10000);
        Mile mile = converter.convert(meter);
        System.out.println(meter.getDistance() + " Meters = " + mile.getDistance() + " Miles:");

        //miles2meters
        Mile mile1 = new Mile(1);
        Meter meter1 = converter.convert(mile1);
        System.out.println(mile1.getDistance() + " Miles = " + meter1.getDistance() + " Meters:");
    }
}