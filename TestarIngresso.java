import ingresso.CamaroteInferior;
import ingresso.CamaroteSuperior;
import ingresso.Ingresso;
import javax.swing.*;

public class TestarIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();

        ingresso.SetIngresso(100);
        System.out.println(ingresso.imprimeValor());
        String tipoIngresso = JOptionPane.showInputDialog("Digite 1 para Normal e 2 para VIP:");

        if (tipoIngresso.equals("2")) {
            String camarote = JOptionPane.showInputDialog("Digite 1 para Camarote Superior e 2 para Camarote Inferior:");
            if (camarote.equals("1")) {
                CamaroteSuperior vip1 = new CamaroteSuperior();
                vip1.setLocalizacao("Camarote Superior");
                System.out.println(vip1.getLocalizacao());
                System.out.println(vip1.camaroteSuperior());
            } else {
                CamaroteInferior vip2 = new CamaroteInferior();
                vip2.setLocalizacao("Camarote Inferior ");
                System.out.println(vip2.getLocalizacao());
                System.out.println(vip2.ingressoVip());

            }
        } else {
            System.out.println(ingresso.imprimeValor());
        }
    }
}
