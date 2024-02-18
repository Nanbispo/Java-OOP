package AtividadesComplementares.Aula1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void fichaTecnica() {
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    int calculaIdade(){
        return 2024 - ano;
    }
}
