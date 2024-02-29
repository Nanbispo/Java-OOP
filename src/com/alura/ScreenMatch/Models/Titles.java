package com.alura.ScreenMatch.Models;

public class Titles implements Comparable<Titles>{
    public String name;
    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double assessment;
    private int totalRatings;

    public Titles(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public double getAssessment() {
        return assessment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void displaysTechnicalSheet() {
        System.out.println("Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
    }

    public void evaluate(double note) {
        assessment += note;
        totalRatings++;
    }

    public double averageRating() {
        return assessment / totalRatings;
    }

    @Override
    public int compareTo(Titles title) {
        return this.getName().compareTo(title.getName());
    }
}
