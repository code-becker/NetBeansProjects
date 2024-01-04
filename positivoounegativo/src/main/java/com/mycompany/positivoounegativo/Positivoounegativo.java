/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.positivoounegativo;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Positivoounegativo {

    /**
     * @param args
     * @param num
     * @return
     */
    public static boolean isPositive(float num) {
        return num >= 0;
    
     Scanner ler = new Scanner(System.in);
    
        float num;
    
        System.out.println("Informe um valor: ");
        num = (int) ler.nextFloat();
        
        boolean retorno = isPositive(num);
        if (retorno == true){
            System.out.println("O numero é positivo");
        }
        else{
            System.out.println("O numero é negativo");
        }
        return false;
        
    }
}

