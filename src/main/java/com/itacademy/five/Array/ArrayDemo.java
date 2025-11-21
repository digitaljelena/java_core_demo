package com.itacademy.five.Array;

/**
 * Tipovi podataka:
 * <li> 1. PROSTI: byte, short, int, long float, double, char, boolean </li>
 * <li> SLOZENI ILI OBJEKT </li>
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println( number );
        number  = 26;
        System.out.println( number );
        // Ukoliko zelim varijablu koja moze upamtiti i 23 i 26 vrijednost- niz kao TIP
        /**
         * 2 nacina kreiranja nizova u javi
         * <p>
         *     Hocu da kreiram varijablu koja moze primiti i broj 23 i borj 26.
         *     Ukupno dva broja cijela.
         * </p>
         */
        // 1. Zauzimam prostor od 2 x 32-bit
        int[] numbers = new int[2];
        //2. ubacili na indekse ili pozicije u nizu dvije vrijednosti
        numbers[0] = 23;
        numbers[1] = 26;
        //numbers[2] = 39; ArrayIndexOutOfBoundsException - Exception Error
        System.out.println("Element at index 0 = " + numbers[0]);
        System.out.println("Element at index 1 = " + numbers[1]);
        //System.out.println("Element at index 2 = " + numbers[2]);ArrayIndexOutOfBoundsException - Exception Error

        /**
         * Drugi način koji se koristi SAMO kada su vam unaprijed POZNATI svi brojevi izgleda ovako.
         */
        //1. i jedini korak: 4x 32-bit -> 0 -> 23; 1 -> 26; 2 -> 39; 3 -> 45
        int[] numbers2 = {23, 26, 39, 45};

    }
}
