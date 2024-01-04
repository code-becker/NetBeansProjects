/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewhile;
import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Atividadewhile {

    public static void main(String[] args) {
        System.out.println("Aprendendo a usar o while: ");
        Scanner ler = new Scanner(System.in);
     int idade, contador;
     double soma, media; 
     
     soma = 0;
     contador = 0;
     do { System.out.println("Digite a idade: ");            
          idade = ler.nextInt();   
          
          soma = soma + idade;
          media = soma / contador;
                    
          contador ++;

         } while (idade !=0);
        System.out.println("a media é: " + media);
      // faca o programa pedir idade 
      // ler idade
      //somar a iadde 
      //dividir soma pelo contdor 
      // contador 
      // WHILE IDADE DIFERENTE DE 0
      // IMPRIMIR A IDADE MEDIA 
}
}