package com.itacademy.vjezbanje.treci;
public class TreciCas {
    public static void main(String[] args) {
        double number1= 0.1;
        double number2= 0.2;
        double suma = number1 + number2;
        suma = Math.round(suma * 100)/100.0; // formula da se zaokruzivanje broja na decimale
        System.out.println( "Da li je suma = 0.3? odgovor?"+ (suma ==0.3));//Da li je suma jednaka 0.3? — true/false
        System.out.println("suma =?"+ suma);//Koliko je suma?

    }
}


