package com.itacademy.four.Operatori;

public class ConcatDemo {
    public static void main(String[] args) {
        char slovo = 'M';
        String name= " Milica ";
        //Operater +
        int number1 = 23;
        int number2 = 34;
        int result = number2 + number1;
        System.out.println("Result = " + result);

        String poruka = name + " Sjajna programerka ";
        System.out.println(poruka);

        String result2 = number2 + "<<-- dmso ";
        System.out.println(result2);

    }
}
