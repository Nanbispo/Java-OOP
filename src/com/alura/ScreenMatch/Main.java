package com.alura.ScreenMatch;

import AtividadesComplementares.Aula1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Poderoso chefão";
        myMovie.releaseYear = 1970;
        myMovie.evaluate(8);
        myMovie.evaluate(4);
        myMovie.evaluate(7);

        myMovie.displaysTechnicalSheet();
        System.out.println(myMovie.assessment);
        System.out.println(myMovie.averageRating());
    }
}
