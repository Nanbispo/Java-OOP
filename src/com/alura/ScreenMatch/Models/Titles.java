package com.alura.ScreenMatch.Models;

import com.google.gson.annotations.SerializedName;

public class Titles implements Comparable<Titles>{
   @SerializedName("Title")
    public String name;
   @SerializedName("Year")
    private int releaseYear;
    private int durationInMinutes;
    private boolean includedInThePlan;
    private double assessment;
    private int totalRatings;

    public Titles(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titles(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
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

    @Override
    public String toString() {
        return "Nome = " + name + ", ano de lançamento = " + releaseYear + " Duração em minutos " + durationInMinutes;
    }
}
