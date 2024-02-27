package com.alura.ScreenMatch.Models;

public class Series extends Titles{
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minutesPerEpisodes;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerSeasons() {
        return minutesPerEpisodes;
    }

    public void setMinutesPerSeasons(int minutesPerSeasons) {
        this.minutesPerEpisodes = minutesPerSeasons;
    }
    @Override
    public int getDurationInMinutes(){
        return seasons * episodesPerSeason * minutesPerEpisodes;
    }
}
