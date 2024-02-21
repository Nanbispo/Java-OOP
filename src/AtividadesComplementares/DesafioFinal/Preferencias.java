package AtividadesComplementares.DesafioFinal;

public class Preferencias {
    public void inclui(Audios audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " Está entre as preferidas no momento.");
        } else {
            System.out.println(audio.getTitulo() + " está entre os menos avaliados");
        }
    }
}
