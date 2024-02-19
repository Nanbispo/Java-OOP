package AtividadesComplementares.Aula2;

public class ContaBancaria {
    String titular = "";
    double numeroConta = 0.00;
    int saldo = 0;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void exibeConta() {
        System.out.println(titular);
        System.out.println(numeroConta);
        System.out.println(saldo);
    }
}

