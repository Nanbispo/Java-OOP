package AtividadesComplementares.segundoCurso.Aula2;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class produtoPrincipal {
    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 5.99, 3);
        Produto cereal = new Produto("Sucrilhos", 9.99, 1);
        Produto cuscuz = new Produto("Cuscuz", 2.99, 5);

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
