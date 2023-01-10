package com.company;

public class MovieDirector extends MovieDemo{
    String director;

    MovieDirector(){

}
    MovieDirector(String name, String country, String genre, String director){
        super(name, country, genre);
        this.director = director;
    }
    public void showdirector(String director){
        System.out.println("The director is "+director);
    }

}
