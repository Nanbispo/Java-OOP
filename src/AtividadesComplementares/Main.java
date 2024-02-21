package AtividadesComplementares;

import AtividadesComplementares.DesafioFinal.Musicas;
import AtividadesComplementares.DesafioFinal.Podcast;
import AtividadesComplementares.DesafioFinal.Preferencias;

public class Main {
    public static void main(String[] args) {


        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("Ywhw se manifestará");
        minhaMusica.setArtista("TodaMusic");
        minhaMusica.setAlbum("Gospel");
        minhaMusica.setGenero("Gospel");

        for (int i = 0; i < 10000; i++) {
            minhaMusica.curte();
        }

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduz();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Desenvolvimento Android");
        meuPodcast.setHost("Lucas Montano");
        meuPodcast.setDescricao("Entendo o caminho para dev android");


        for (int i = 0; i < 6000; i++) {
            meuPodcast.curte();
        }

        for (int i = 0; i < 4600; i++) {
            meuPodcast.reproduz();

        }

        Preferencias preferidas =  new Preferencias();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
