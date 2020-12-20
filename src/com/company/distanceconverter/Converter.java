package com.company.distanceconverter;

public class Converter {

    public Mile convert(Meter meter) {
        Mile mile = new Mile(meter.getDistance() / 1609.344);
        return mile;
    }

    public Meter convert(Mile mile) {
        Meter meter = new Meter(mile.getDistance() * 1609.344);
        return meter;
    }
}