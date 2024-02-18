package AtividadesComplementares.Aula1;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avalicao;
    int numeroDeAvaliacoes;
    void FichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }


    void avalia(int nota){
        avalicao += nota;
        numeroDeAvaliacoes++;
    }

    double notaMedia(){
        return avalicao / numeroDeAvaliacoes;
    }
}
