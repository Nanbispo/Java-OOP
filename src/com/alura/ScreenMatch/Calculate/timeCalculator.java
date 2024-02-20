package com.alura.ScreenMatch.Calculate;

import com.alura.ScreenMatch.Models.Titles;



public class timeCalculator {
    private int totalTime;
    public int getTotalTime(){
        return this.totalTime;
    }

    public void inclued (Titles t){
        System.out.println("Adicionando duração em minutos de " + t);
        this.totalTime += t.getDurationInMinutes();
    }
}
