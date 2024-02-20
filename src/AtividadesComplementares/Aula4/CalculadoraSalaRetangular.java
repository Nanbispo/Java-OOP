package AtividadesComplementares.Aula4;

// Classe CalculadoraSalaRetangular implementando CalculoGeometrico
public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }

    public class TesteCalculadoraSalaRetangular {
        public static void main(String[] args) {
            CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
            calculadora.calcularArea(5, 8); // Exemplo com altura e largura
            calculadora.calcularPerimetro(5, 8);
        }
    }
}
