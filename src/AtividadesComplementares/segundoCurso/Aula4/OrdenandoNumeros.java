package AtividadesComplementares.segundoCurso.Aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenandoNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(3);
        numeros.add(1);
        numeros.add(5);
        numeros.add(6);
        numeros.add(2);
        numeros.add(4);

        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println("Ordem crescente: " + numeros);
    }
}
