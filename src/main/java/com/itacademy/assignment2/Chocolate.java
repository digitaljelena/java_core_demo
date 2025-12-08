package com.itacademy.assignment2;

public class Chocolate extends Product {
    double weight; // u gramima


    public Chocolate(String name, String barcode, double basePrice, double weight) {
        super(name, barcode, basePrice);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chocolate name: " + name + "\n" +
                "Barcode: " + barcode + "\n" +
                "Base price: " + basePrice + "\n" +
                "Weight: " + weight + "g";
    }


}
