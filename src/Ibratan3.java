import javax.swing.*;
import java.text.DecimalFormat;

public class Ibratan3 {
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat("#00.00");

        double renda, parcela, fatorAprovador = 40, fatorReal;

        renda = Double.parseDouble(JOptionPane.showInputDialog
                ("Informe sua renda"));
        parcela = Double.parseDouble(JOptionPane.showInputDialog
                ("Informe o valor da parcela do bem"));

        fatorReal = (parcela * 100) / renda;

        if (fatorReal <= fatorAprovador) {
            JOptionPane.showMessageDialog
                    (null, "Percentual da renda comprometido pela parcela " + form.format(fatorReal) + "%");
            JOptionPane.showMessageDialog
                    (null, "Parabéns, crédito aprovado");
        } else {
            JOptionPane.showMessageDialog
                    (null, "Percentual da renda comprometido pela parcela " + form.format(fatorReal) + "%");
            JOptionPane.showMessageDialog
                    (null, "Infelizmente seu crédito não será aprovado");
        }

    }
}
