package ingresso;

public class IngressoVip extends Ingresso {

    double valorAdicional = 30;

    public String ingressoVip() {
        valorIngresso = valorIngresso + valorAdicional;
        return "Ingresso VIP: " + valorIngresso;
    }
}
