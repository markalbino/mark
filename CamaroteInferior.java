package ingresso;

public class CamaroteInferior extends IngressoVip {

    String localizacaoIngresso;

    public void setLocalizacao(String localizacao) {
        localizacaoIngresso = localizacao;
    }

    public String getLocalizacao() {
        return "Localização do Ingresso: " + localizacaoIngresso;
    }
}
