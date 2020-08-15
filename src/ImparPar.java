import javax.swing.*;

public class ImparPar {
    public static void main(String[] args) {
        int par = 0, impar = 0 , numero = 0 , soma = 0;

        for(int i = 1;i <= 10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+i+"° número"));
            soma += numero;

            if(numero % 2 == 0){
                par = (par + 1);
            }else{
                impar = (impar +1);
            }

        }
        JOptionPane.showMessageDialog(null,
                "São "+par+" números pares e "+impar+" números ímpares, e a soma deles é "+soma);
    }
}
