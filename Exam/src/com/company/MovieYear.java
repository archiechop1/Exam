package com.company;

public class MovieYear extends MovieDirector{
    public int year;

    MovieYear(){

 }
    MovieYear(String name, String country, String genre, String director, int year){
        super(name, country, genre, director);
        this.year=year;
    }
    public void showtheyear (int year){
        System.out.println("A year the film was released is "+year);
    }
}
