package com.alura.ScreenMatch.Models;

import com.alura.ScreenMatch.Calculate.classifiable;

public class Movies extends Titles implements classifiable {
   String director;

   //Em Java, um construtor é um método especial usado para criar e inicializar um objeto recém-criado.
    public Movies(String name, int releaseYear) {
        super(name, releaseYear);

    }

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

    @Override
    public String toString() {
        return "Filme: " + getName() + " (" + getReleaseYear() + ")";
    }
}
