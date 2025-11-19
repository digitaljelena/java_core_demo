package com.itacademy.three;

public class DecimalDemo {
    public static void main(String[] args) {
        /**
         * U javi imamo dva primitivna tipa za decimalne brojeve
         * float -> 32 bitni
         * double -> 64 bitni (DEFAULT)
         */
        float floatNumber = (float) 10.3;// Losi nacin
        float floatNumber3 = 10.3F; //Bolji nacin
        double dobuleNumber = 10.3;
        /**
         *  Nikada nemojte koristiti double i float za finansijske ili neke druge proracune
         *  koji zahtijevaju decimalnu preciznost
         *  <p>
         *      BigDecimal-> preciznost
         *  </p>
         */
        double number1 = 0.1;
        double number2 = 0.2;
        double suma = number1 + number2;
        suma  = Math.round (suma * 100.0)/ 100.0;
        System.out.println ("Da li je suma  = 0.3? Odgovor" + (suma ==0.3) );
        System.out.println("Suma = " + suma );




    }
}
