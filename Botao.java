/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botao;

import java.util.Scanner;

/**
 *
 * @author Bryann
 */
public class Botao {

    public static boolean botaoHabilitado = true;
    public static void main(String[] args) {
        boolean Botao = false;
        String apertaBotao;
        String frase = "Casa Amarela";
        int primeirosCaracteres = 0;
        while(botaoHabilitado) {
         System.out.println("Deseja apertar o botão? Se sim, digite true"
                + ", caso não digite false");
        Scanner teclado = new Scanner(System.in);
        apertaBotao = teclado.nextLine();
        if(apertaBotao.equals("true")) {
            Botao =  true;
            while(Botao) {
            System.out.println(MeusCaracteres(frase, primeirosCaracteres));
            Botao = false;
            
            }
            primeirosCaracteres += 5;
           
        }
        else {
            Botao = false;
            
        }   
        }
        
        
        
    }
    
    public static String MeusCaracteres (String frase, int primeirosCaracteres
    ) {
        
        String caracteres = null;
        if(frase.length()-(primeirosCaracteres)<5) {
            int caracteresQueSobraram = frase.length()-(primeirosCaracteres);
            caracteres = frase.substring(primeirosCaracteres, frase.length());
            botaoHabilitado = false;
        }
        
        else {
            caracteres = frase.substring(primeirosCaracteres, primeirosCaracteres+5);
        }
        
        
        return caracteres;
        
       
    }
    
}
