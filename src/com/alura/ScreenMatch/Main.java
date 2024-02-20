package com.alura.ScreenMatch;

import com.alura.ScreenMatch.Calculate.timeCalculator;
import com.alura.ScreenMatch.Models.Movies;
import com.alura.ScreenMatch.Models.Series;

public class Main {
    public static void main(String[] args) {
        Movies avatar = new Movies();
        avatar.setName("Avatar");
        avatar.setDurationInMinutes(180);

        Movies ophehaimer = new Movies();
        ophehaimer.setName("Ophehaimer");
        ophehaimer.setDurationInMinutes(90);


        Series suits = new Series();
        suits.setName("Suits");
        suits.setReleaseYear(2008);
        suits.displaysTechnicalSheet();
        suits.setSeasons(9);
        suits.setEpisodesPerSeason(20);
        suits.setMinutesPerSeasons(50);
        System.out.println("minutos de aaaaaaaaaa "+ suits.getDurationInMinutes());

        timeCalculator calculator = new timeCalculator();
        calculator.inclued(avatar);
        calculator.inclued(ophehaimer);

        calculator.inclued(suits);

        System.out.println("O tempo necessario para maratonar " + calculator.getTotalTime());
    }
}
