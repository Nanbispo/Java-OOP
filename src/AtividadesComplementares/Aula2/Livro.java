package AtividadesComplementares.Aula2;

public class Livro {
    String titulo = "";
    String autor = "";

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void fichaDoLivro(){
        System.out.println(titulo);
        System.out.println(autor);
    }
}
