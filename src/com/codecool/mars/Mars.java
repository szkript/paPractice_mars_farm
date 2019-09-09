package com.codecool.mars;

public class Mars {
    static final int NUM_OF_MONTHS = 20;

    public static void main(String[] args) {
        Farm farm = new Farm();
        farm.addPlant(new Spruce());
        farm.addPlant(new Juniper());
        farm.addPlant(new AlmondTree());
        farm.operate(NUM_OF_MONTHS);
    }
}
