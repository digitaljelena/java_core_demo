package com.itacademy.four.Operatori;

/**
 * 1. + -> Unarni plus operator; indicra da se radi o pozitivnom broju
 * 2. - -> Unarni minus operator
 * 3. ++ -> Inkrement
 *    3.1 pre inkrement
 *    3.2 post inkrement
 * 4. -- Declement
 *   4.1 pre
 *   4.2 post
 *   5. Invertor / Komplement
 */

public class UnaryDemo {
    public static void main(String[] args) {
        int number= 23;
        number ++; // number = number +1 ;
        System.out.println(number);
        number= 23;
        ++number;
        System.out.println(number);


         int broj= 24;
        System.out.println(broj --);// 24-> 23
        System.out.println(-- broj);// 22-> 22

        boolean success =  true;
        System.out.println(! success);

    }
}
