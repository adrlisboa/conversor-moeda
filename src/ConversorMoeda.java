public class ConversorMoeda {
    double taxaDolar;
    double taxaEuro;

    public double realParaDolar(double valor, double taxa) {
        return valor / taxaDolar;
    }

    public double dolarParaReal(double valor, double taxa) {
        return valor * taxaDolar;
    }

    public double realParaEuro(double valor) {
        return valor / taxaEuro;
    }

    public double euroParaReal(double valor) {
        return valor * taxaEuro;
    }
}
