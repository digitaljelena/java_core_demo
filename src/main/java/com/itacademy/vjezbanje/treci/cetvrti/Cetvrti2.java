package com.itacademy.vjezbanje.treci.cetvrti;

import java.util.Scanner;

public class Cetvrti2 {
    public static void main(String[] args) {
        System.out.println("Upisi omiljeni broj");
        int omiljeniBroj= new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23;
        if (condition) {
            System.out.println("Zadovoljio si");
        } else {
            System.out.println("Nisi zadovoljio");
        }
    }
}
