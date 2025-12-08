package com.itacademy.osam.demo;

import com.itacademy.osam.demo.oop.Movie;

public class ContinueDemo {

    public static void main(String[] args) {
     Movie movie  = new Movie ();
    String text = "Petar Pan je pojeo pet plavih šljiva";
    int counter = 0;
    for (int i = 0; i < text.length(); i++) {
        char slovoText = text.charAt(i);
        if (slovoText != 'p' && slovoText != 'P') {
            continue;
        }
        counter++;
    }
    String message = "Slovo 'p' ili 'P' se nalazi u datom tekstu '%s' puta".formatted(counter);
    System.out.println(message);
}
}
