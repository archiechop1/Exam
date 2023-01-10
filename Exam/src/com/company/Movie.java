package com.company;

public class Movie {
    public static void main(String[] args) {
        MovieYear film1 = new MovieYear("Perfect blue", "Japan", "Psychological thriller", "Satoshi Kon", 1998);
        System.out.println(film1.name+" "+film1.country+" "+film1.genre+" "+film1.director+" "+film1.year+" ");
        film1.showdirector("Satoshi Kon");
        film1.showtheyear(1998);
    }
}
