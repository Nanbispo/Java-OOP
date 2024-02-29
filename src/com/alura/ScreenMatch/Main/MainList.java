package com.alura.ScreenMatch.Main;

import com.alura.ScreenMatch.Models.Movies;
import com.alura.ScreenMatch.Models.Series;
import com.alura.ScreenMatch.Models.Titles;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Movies avatar = new Movies("Avatar", 2023);
        avatar.evaluate(10);
        Movies ophehaimer = new Movies("Ophehaimer", 2023);
        ophehaimer.evaluate(7);
        var ragnarok = new Movies("Ragnarok", 2019);
        ragnarok.evaluate(3);
        Series suits = new Series("Suits", 2008);
        suits.evaluate(10);


        List<Titles> List = new LinkedList<>();
        List.add(ragnarok);
        List.add(suits);
        List.add(avatar);
        List.add(ophehaimer);

        for (Titles item: List){
            System.out.println(item.getName());
            if (item instanceof Movies movie && ((Movies) item).getClassification() > 2){
                System.out.println("Classificação: " + movie.getClassification());
            }
        }
/*implementação do meotodo compareable para ordenação dos componentes por ordem alfabetica*/
        Collections.sort(List);
        System.out.println("Lista ordenada: " + List);


        List.sort(Comparator.comparing(Titles::getReleaseYear));
        System.out.println("Lista ordenada por ano de lançamento: " + List);
    }
}
/*a partir do Java 8, foi adicionado na interface List, a qual a classe ArrayList implementa,
um novo método chamado forEach, que possibilita a iteração sobre os elementos da lista de forma mais concisa e elegante.*/
//        List.forEach(item -> System.out.println(item));

