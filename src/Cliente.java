import javax.swing.*;
import java.util.Date;

public class Cliente {
    public static void main(String[] args) {

        int idade, renda, score, pont;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        renda = Integer.parseInt(JOptionPane.showInputDialog("Informe sua renda"));
        score = Integer.parseInt(JOptionPane.showInputDialog("Informe seu score"));

        if (idade <= 25) {
            pont = 5;
        } else {
            pont = 10;
        }

        if (score <= 540) {
            pont += 5;
        }else{
            pont += 10;
        }

        if(renda <= 1500){
            pont+= 5;
        }else{
            pont+= 10;
        }

        if(pont >=25){
            System.out.println("Ótima pontuacão");
            System.out.println(pont);
        }else{
            System.out.println("Vamos melhorar isso ai");
        }

    }

}
