package AtividadesComplementares.segundoCurso.Aula4;

import java.util.ArrayList;
import java.util.Collections;

public class Titulo implements Comparable<Titulo> {
    String nome;

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }
}

class MainTitulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());
        listaTitulos.add(new Titulo());

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);

        }
    }
}

