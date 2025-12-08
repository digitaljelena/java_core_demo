package com.itacademy.assignment2;

public class Wine extends Product {
    double volume; // u litrima
    private static final double ALCOHOL_TAX = 0.1; // dodatni porez od 10%


    public Wine(String name, String barcode, double basePrice, double volume) {
        super(name, barcode, basePrice);
        this.volume = volume;
    }

    @Override
    public double calculatePrice() {
        double priceWithTax = super.calculatePrice(); // osnovni porez 20%
        return priceWithTax * (1 + ALCOHOL_TAX); // dodatni porez za alkohol
    }

    @Override
    public String toString() {
        return "Wine name: " + name + "\n" +
                "Barcode: " + barcode + "\n" +
                "Base price: " + basePrice + "\n" +
                "Volume: " + volume + "L";
    }


}

