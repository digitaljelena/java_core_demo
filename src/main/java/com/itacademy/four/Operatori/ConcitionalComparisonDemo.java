package com.itacademy.four.Operatori;

import java.util.Scanner;

public class ConcitionalComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj 1");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj 2");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println("Number2=" + number2);
        if ((number1 == 23) && (number2++ < 10 )){
            System.out.println("Michael Jordan ili neki fudbaler");
        }
        System.out.println("Number22 =" + number2);
        if (( number1 == 23) || (number2 < 10 )) {
            System.out.println("Ili je Michael Jordan ili je neki fudbaler");
        }



    }
}
