import javax.swing.*;
import java.text.DecimalFormat;

public class TodosAprovados {
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat("#0.0");
        String nome;
        double nota1,nota2,nota3, media;

        nome = JOptionPane.showInputDialog("Informe o nome do aluno(a)");
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe 1° nota de "+nome));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe 2° nota de "+nome));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe 3° nota de "+nome));

        media = (nota1+nota2+nota3) / 3;

        JOptionPane.showMessageDialog
                (null,"A média de "+nome+" nas avaliações foi de "+form.format(media));



    }
}
