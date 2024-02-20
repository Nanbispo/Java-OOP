package com.alura.ScreenMatch.Calculate;

public class recommendationFilter {
    public void filter(classifiable classifiable) {
        if (classifiable.getClassification() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if(classifiable.getClassification() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Menos avaliados");
        }
    }
}

