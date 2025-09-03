public class ConversorMoeda {
    double taxaDolar = 5.47;
    double taxaEuro = 6.36;

    public double realParaDolar(double valor) {
        return valor / taxaDolar;
    }

    public double dolarParaReal(double valor) {
        return valor * taxaDolar;
    }

    public double realParaEuro(double valor) {
        return valor / taxaEuro;
    }

    public double euroParaReal(double valor) {
        return valor * taxaEuro;
    }
}
