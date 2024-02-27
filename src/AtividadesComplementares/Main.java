package AtividadesComplementares;

import AtividadesComplementares.segundoCurso.Aula1.Produto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produto cereal = new Produto("Sucrilhos", 20.00, 2);

        Produto arroz = new Produto("Arroz Tio João", 7.00, 3);

        Produto cuscuz = new Produto("Cuscuz", 4.40, 2);

        cuscuz.valorFinal();
        ArrayList<Produto> lista = new ArrayList();

        lista.add(cereal);
        lista.add(arroz);
        lista.add(cuscuz);
        System.out.println("Tamanho da lista: "+ lista.size());
        System.out.println("Primeiro item da lista "+ lista.get(0).getNome());

        for (Produto produto : lista){
            System.out.println(produto);
        }

    }
}
