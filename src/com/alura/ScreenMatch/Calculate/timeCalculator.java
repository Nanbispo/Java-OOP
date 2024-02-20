package com.alura.ScreenMatch.Calculate;
import com.alura.ScreenMatch.Models.Titles;
import com.alura.ScreenMatch.Models.Series;
import com.alura.ScreenMatch.Models.Movies;
public class timeCalculator {
    private int totalTime;
    public int getTotalTime(){
        return this.totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void inclued (Titles title){
        System.out.println("Adicionando duração em minutos de " + title);
        this.totalTime += title.getDurationInMinutes();
    }
}
