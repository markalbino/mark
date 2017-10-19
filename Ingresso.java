package ingresso;

public class Ingresso {

    double valorIngresso = 100;

    public void SetIngresso(double Ingresso) {
        valorIngresso = Ingresso;
    }

    public String imprimeValor() {
        return "Valor do ingresso: R$" + valorIngresso;
    }

}
