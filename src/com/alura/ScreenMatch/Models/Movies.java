package com.alura.ScreenMatch.Models;

import com.alura.ScreenMatch.Calculate.classifiable;

public class Movies extends Titles implements classifiable {
   String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getClassification() {
        return (int) averageRating() /2;
    }
}
