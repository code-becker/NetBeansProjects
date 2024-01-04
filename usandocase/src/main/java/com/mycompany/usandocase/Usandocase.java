/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usandocase;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Usandocase {

    public static void main(String[] args) {
        System.out.println("Aprendendo a usar o case!");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero referente ao mês desejado: ");
        int numero = ler.nextInt();
        
        switch (numero){
           case 1:
              System.out.println("O mês é Janeiro!");
              break;
           case 2: 
               System.out.println("o mês é Fevereiro!");
               break;
           case 3: 
               System.out.println("o mês é Março!");
               break;
           case 4:
               System.out.println("o mês é Abril! ");
            
           default:
               System.out.println("Não existe nenhum mês correspondente ao numero escolhido! "
                       + " Digite um numero de 1 a 4: ");
        }
        
                
    }
}

