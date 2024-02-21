package AtividadesComplementares.DesafioFinal;

public class Podcast  extends Musicas{
    private String apresentador;
    private String descricao;

    public String getHost() {
        return apresentador;
    }

    public void setHost(String host) {
        this.apresentador = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getTotalCurtidas() {
        if (getTotalCurtidas() > 10){
            return 10;
        } else {
            return 8;
        }
    }
}
