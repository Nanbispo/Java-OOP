package AtividadesComplementares.Aula4;

// Classe ConversorTemperaturaPadrao implementando ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public double celsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }

    public class TesteConversorTemperatura {
        public static void main(String[] args) {
            ConversorTemperatura conversor = new ConversorTemperaturaPadrao();

            double temperaturaCelsius = 25;
            double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
            System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

            temperaturaFahrenheit = 77;
            temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
            System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
        }
    }
}
