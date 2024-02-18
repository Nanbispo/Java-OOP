package com.alura.ScreenMatch;

public class Movie {
    String name;
    int releaseYear;
    int durationInMinutes;
    boolean includedInThePlan;
    int assessment;
    double totalRatings;


    void displaysTechnicalSheet() {
        System.out.println(name);
        System.out.println(releaseYear);
    }

    void evaluate(double note) {
        assessment += note;
        totalRatings++;
    }

    double averageRating() {
        return assessment / totalRatings;
    }
}
