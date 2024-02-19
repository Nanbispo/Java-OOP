package com.alura.ScreenMatch;

import com.alura.ScreenMatch.Models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);

        myMovie.displaysTechnicalSheet();




        myMovie.setDurationInMinutes(180);
        myMovie.evaluate(8);
        myMovie.evaluate(4);
        myMovie.evaluate(7);

        myMovie.setIncludedInThePlan(true);
        System.out.println(myMovie.getName());


        System.out.println(myMovie.getAssessment());
        System.out.println(myMovie.averageRating());
        System.out.println(myMovie.getTotalRatings());


    }
}
