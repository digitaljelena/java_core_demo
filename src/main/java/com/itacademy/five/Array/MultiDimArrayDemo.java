package com.itacademy.five.Array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0]= "senaid";
        names[1]= "Milica";
        names[2]= "Elmir";
        // Her Frau Her
        // Senaid Milica Elimir

        String[] names2= {"Senaid","Milica","Elmir"};
        char slovo = 'w';
        //Ukoliko su svi elementi iste [] duzine -matrici
        String [][] array= {
                {"Her", "Frau", "Her"},
                {"Denaid ", "Milica", "Elmir"}

        };
        System.out.println(array[0][1] + " " +  array [1][1]);
        System.out.println(array [0][0] + " " + array [1][1]);
        System.out.println(array.length ); //2 , duzina niza
        System.out.println(array[0]. length);//3
        System.out.println(array[1].length);// 3
        System.out.println(array[0][2] +  " " + array[1][2]);
    }
}
