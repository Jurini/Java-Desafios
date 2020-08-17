import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;

public class Ibratan1 {
    public static void main(String[] args) {
        String estados[] = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA"
                , "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"};


        for (int i = 0; i < estados.length; i++) {
            if (estados[i] == "SC" || estados[i] == "PR" || estados[i] == "RS") {
                System.out.print(estados[i] + "\n");
            }

        }
    }
}






