package com.alura.ScreenMatch.Models;

import com.alura.ScreenMatch.Calculate.classifiable;

public class Epsode implements classifiable {
    private int number;
    private String name;
    private Series serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }


    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
