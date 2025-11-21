package com.itacademy.four.Operatori;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("Koliko je 2 +2 ");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTacnosti  =  result == 4;
        //"Tacno" ili "Netacno" JDK 7 ? Ternarni if condition
        String message = uslovTacnosti ? "Tacno " : "Netacno ";
        if (uslovTacnosti) {
            message = "Tacno";
        } else  {
            message = "Netacno";
        }
        System.out.println(message);
    }
}
