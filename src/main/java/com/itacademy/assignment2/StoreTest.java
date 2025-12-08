package com.itacademy.assignment2;

public class StoreTest {
    public static void main(String[] args) {
        Product product = new Product("Generic Product", "000123", 100.0);
        System.out.println(product.toString());
        System.out.println("Final price: " + product.calculatePrice() + "\n");


        Chocolate chocolate = new Chocolate("Milk Chocolate", "111234", 50.0, 200);
        System.out.println(chocolate.toString());
        System.out.println("Final price: " + chocolate.calculatePrice() + "\n");

        Wine wine = new Wine("Red Wine", "222345", 150.0, 0.75);
        System.out.println(wine.toString());
        System.out.println("Final price: " + wine.calculatePrice());
    }

}


