package com.itacademy.four;

public class FourDemo {
    public static void main(String[] args) {
// TIPOVI PODATAKA varijabla = vrijednost
        int firstNumber = 23; // DECIMALNI zapis vrijednosti
        System.out.println(firstNumber);
        int secondNumber = 0x1a; // HEKSADECIMALNI zapis vrijednosti
        System.out.println(secondNumber);
        // 26 binarno-> 16=2"4 8=2"3 2"1=2 11010
        int thirdnUmber= 0b11010;
        System.out.println(thirdnUmber);

        long creditCardNumber= 1234_5678_9191L; // Ovo ne moramo da znamo, samo nam pokazuje primjer da vidimo kako izgleda
        long hexNumber= 0XFF_EC;// Ovo ne moramo da znamo samo nam pokazuje kako izgleda, ako se nekada sa ovim suocimo


    }
}
