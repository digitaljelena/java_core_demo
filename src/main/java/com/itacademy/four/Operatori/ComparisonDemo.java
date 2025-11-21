
package com.itacademy.four.Operatori;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Operator poredjenja:
 * 1. == equal to /jednako je
 * 2. != not equal / nije jednako
 * 3. > greath than/ vece od
 * 4. < less than/ manje od
 * 5. >= vece ili jednako
 * 6. <=manje ili jednako
 */


public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj:");
        int number2= new Scanner(System.in).nextInt();
        if (number1 == number2) {
            System.out.println("Brojevi su jednaki");
        }
        if ( number1 != number2){
            System.out.println("Brojevi su razliciti");
        }
        if (number1> number2){
            System.out.println("Prvi broj veci od drugog");
        }
        if (number1 >= number2 ) {
            System.out.println("Prvi broj je veci ili bar jednak drugom");
        }
        if (number1 < number2) {
            System.out.println("Prvi broj je manji od drugog");
        }
        if (number1 <= number2){
            System.out.println("Prvi broj je manji ili bar jednak drugom");
        }

    }
}
