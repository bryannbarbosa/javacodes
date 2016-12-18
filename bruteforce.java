
package bruteforce;

import java.util.Scanner;

public class Bruteforce {

    public static void main(String[] args) {
        String senha_temp = "";
        String senha = "";
        int incremento = 0;
        Scanner teclado = new Scanner(System.in);
        int quant, cracks = 0;
        
        System.out.println("Informe a senha: ");
        senha = teclado.next();
        System.out.println("Informe a quantidade de caracteres a serem testados:");
        quant = teclado.nextInt();
        
        int[] caracter = new int[quant];
        
        // Limpa todo o vetor
        for (int i = 0; i < incremento - 1; i++) {
            caracter[i] = 0;
        }
        // Lista de caracteres utilizáveis
        String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",};
        
        //Inicio do hack
        incremento++;
        while (!senha_temp.equals(senha)) {
            for (int i = 0; i < incremento; i++) {
                if (i < incremento - 1) {
                    if (caracter[i] == array.length) {
                        caracter[i + 1]++;
                        caracter[i] = 0;
                        
                    }
                } else if (i == incremento - 1) {
                    if (caracter[i] == array.length) {
                        incremento++;
                        caracter[i + 1]++;
                        caracter[i] = 0;
                        
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < incremento; i++) {
                sb.append(array[caracter[i]]);
            }
            senha_temp = sb.toString();
            System.out.println(senha_temp);
            caracter[0]++;
            cracks++;
            
            
            
    }
        System.out.println("A senha encontrada é " + senha_temp);
        System.out.println("Foram testadas " + cracks + " combinações");
    }
    
}
