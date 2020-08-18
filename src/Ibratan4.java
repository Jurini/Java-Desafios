import org.omg.CORBA.DATA_CONVERSION;

import javax.swing.*;
import java.time.LocalDate;


public class Ibratan4 {
    public static void main(String[] args) {

        int pontuacao = 0;
        int soma = 0;

        String nome = JOptionPane.showInputDialog("Informe seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        int renda = Integer.parseInt(JOptionPane.showInputDialog("Informe sua renda"));
        int score = Integer.parseInt(JOptionPane.showInputDialog("Informe seu score"));

        if (idade > 25) {
            pontuacao = 10;
        } else {
            pontuacao = 5;
        }

        soma = 5 * pontuacao * 2 * 2;

        if (renda > 3450) {
            pontuacao = 10;
        } else {
            pontuacao = 5;
        }

        soma += 5 * pontuacao * 2 * 4;

        if (score > 540) {
            pontuacao = 10;
        } else {
            pontuacao = 5;
        }

        soma += 5 * pontuacao * 2 * 5;

        JOptionPane.showMessageDialog
                (null, "A pontuação final do cliente é: " + soma);


    }
}
