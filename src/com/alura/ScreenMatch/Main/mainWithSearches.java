package com.alura.ScreenMatch.Main;

import com.alura.ScreenMatch.Exceptions.YearConversionErrorException;
import com.alura.ScreenMatch.Models.TitleOmdb;
import com.alura.ScreenMatch.Models.Titles;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class mainWithSearches {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Nome do filme: ");
        var search = reader.nextLine();

        String key = "b12a8783";
        String addres = "http://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=" + key;
        try {
//Requisição Http de uma API externa
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(addres)).build();
//Resposta dada a partir da API que foi requisitada
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();


            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            Titles myTitle = new Titles(myTitleOmdb);
            System.out.println("Titulo ja convertirdo");
            System.out.println(myTitle);

        } catch (NumberFormatException e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getMessage());
            //Finally é o atributo que vai exibir a mensagem de sucesso, com o programa tendo tido sucesso na execução ou não!
        } catch (IllegalArgumentException e) {
            System.out.println("Ocorreu um erro na busca");

        } catch (YearConversionErrorException e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Programa executou corretamente!");
        }
    }
}
