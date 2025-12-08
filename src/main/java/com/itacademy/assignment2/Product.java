package com.itacademy.assignment2;

public class Product {
    String name;
    String barcode;
    double basePrice;
    private static final double TAX = 0.2; // 20% porez

    public Product(String name, String barcode, double basePrice) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return basePrice * (1 + TAX);
    }

    @Override
    public String toString() {
        return "Product name: " + name + "\n" +
                "Barcode: " + barcode + "\n" +
                "Base price: " + basePrice;
    }
}
