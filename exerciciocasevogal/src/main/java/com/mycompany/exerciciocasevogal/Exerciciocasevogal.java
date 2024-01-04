/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciocasevogal;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Exerciciocasevogal {

    public static void main(String[] args) {
        System.out.println("Diferenciando vogais de consoantes!");
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a letra e lhe informarei se é uma vogal ou uma consoante: ");
        String letra = ler.nextLine();
       
        switch (letra){
           case "a":
              System.out.println("Vogal ");
              break;
           case "e": 
               System.out.println("Vogal ");
               break;
           case "i": 
               System.out.println("Vogal ");
               break;
           case "o":
               System.out.println("Vogal ");
           case "u":
               System.out.println("Vogal ");
       
           default:
               System.out.println("Consoante");
        }
    }
}
