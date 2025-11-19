package com.itacademy.three;

public class Integer {
    public static void main(String[] args) {
        byte byteBroj = 127;
        short shortNumber = 32767;
        int number = 23; // DEFAULT
        //32->16 bitni
        //1.step:number je vrijednost 32 bitna
        //2. ne smijem ubaciti to u 16 bitni prostor dok neko ne preuzme odgovornost za onih 16 koje moram otkinuti
        //3.step: ubaci vrijednost
        short shortNumber1=(short) number; // EKSPLICITNA KONVENCIJA
        int number2 = shortNumber;// AUTOMATSKA KONVENCIJA
        // 1. VRIJEDNOST: 32bitni zapis  u kojem se nalazi "32"
        //2. konvertovat  u 64 bitni zapis-> 32 + 32 bita (ove dodatne bite samo stavi nule)
        //3. ubaci vrijednosti
        long longNumber = 32L;

        
    }
}
