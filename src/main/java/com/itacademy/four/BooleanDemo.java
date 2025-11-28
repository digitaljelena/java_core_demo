package com.itacademy.four;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Hej Zdravo! Upisi omiljeno  broj");
        int omiljeniBroj= new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23;// True ili false
        if(condition) {
            System.out.println("Zadovoljio si..");
        } else{
            System.out.println("Nisi zadovoljio .. ");
        }


    }
}
