package AtividadesComplementares.Aula2;

public class IdadePessoa {
    private String pessoa;
    private int idade;

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaMaiorIdade(){
        if (idade >= 18){
            System.out.println("Você é maior de idade");;
        } else {
            System.out.println("Você ainda é menor de idade");
        }
    }
}
