package AtividadesComplementares.segundoCurso.Aula3;

import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Java");
        listaString.add("Kotlin");
        listaString.add("C++");
        listaString.add("C#");
        listaString.add("SQL");
        listaString.add("Compose");
        listaString.add("Android");

        for (String i: listaString){
            System.out.println(i);
        }

    }
}
