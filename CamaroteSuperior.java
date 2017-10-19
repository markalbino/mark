package ingresso;

public class CamaroteSuperior extends IngressoVip {

    double taxaSuperior = 80;
    double valor = valorIngresso + taxaSuperior + valorAdicional;
    String localizacaoIngresso;

    public void setLocalizacao(String localizacao) {
        localizacaoIngresso = localizacao;
    }

    public String getLocalizacao() {
        return "Localização do Ingresso: " + localizacaoIngresso;
    }

    public String camaroteSuperior() {
        return "Ingresso do camarote superior: R$" + valor;
    }
}
