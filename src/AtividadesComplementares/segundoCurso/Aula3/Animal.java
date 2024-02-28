package AtividadesComplementares.segundoCurso.Aula3;



class Animal {
    String nome;
    String raca;
    int idade;

    @Override
    public String toString() {
        return "Animal " + "nome=" + nome + ", raca='" + raca +  ", idade=" + idade;
    }
}

class Cachorro extends Animal {

}

class Main {
    public static void main(String[] args) {
        Cachorro animal = new Cachorro();
        animal.nome = "Cerbero";
        animal.raca = "Cachorro";
        animal.idade = 4;

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println(animal.nome);
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}


