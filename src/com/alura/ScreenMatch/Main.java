package com.alura.ScreenMatch;

import com.alura.ScreenMatch.Calculate.timeCalculator;
import com.alura.ScreenMatch.Models.Movies;
import com.alura.ScreenMatch.Models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movies avatar = new Movies("Avatar", 2023);
        avatar.setDurationInMinutes(180);

        Movies ophehaimer = new Movies("Ophehaimer", 2023);
        ophehaimer.setDurationInMinutes(90);

        /*var. Essa nova palavra-chave permite que o compilador infira automaticamente o tipo da variável com base no valor atribuído a ela.
        Isso pode tornar o código mais limpo e legível, além de reduzir a digitação de código redundante*/
        var ragnarok = new Movies("Ragnarok", 2019);
        ragnarok.setDurationInMinutes(120);

        Series suits = new Series("Suits", 2008);
        suits.displaysTechnicalSheet();
        suits.setSeasons(9);
        suits.setEpisodesPerSeason(20);
        suits.setMinutesPerSeasons(50);
        System.out.println("minutos de Suits "+ suits.getDurationInMinutes());


        timeCalculator calculator = new timeCalculator();
        calculator.inclued(avatar);
        calculator.inclued(ophehaimer);

        calculator.inclued(suits);

        System.out.println("O tempo necessario para maratonar " + calculator.getTotalTime());

        ArrayList<Movies> moviesList = new ArrayList<>();
        moviesList.add(avatar);
        moviesList.add(ophehaimer);
        moviesList.add(ragnarok);
        System.out.println("Tamanho da lista: " + moviesList.size());
        System.out.println("Primeiro filme da lista: " + moviesList.get(0).getName());
        System.out.println(moviesList);
    }
}
