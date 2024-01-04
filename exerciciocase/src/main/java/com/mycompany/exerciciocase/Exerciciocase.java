/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//1. Crie um programa que lê o conceito de um aluno na disciplina BCC201 (Introdução à
//Programação) e imprime seu significado, de acordo com a tabela abaixo. Caso seja
//informado um conceito inexistente, deve ser exibida uma mensagem de erro.

package com.mycompany.exerciciocase;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Exerciciocase {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner ler = new Scanner(System.in);
      
        System.out.println("Digite a letra A,B,C,D,E ou F para saber o seu conceito; ");
        String letra = ler.nextLine();
       
        switch (letra){
           case "A":
              System.out.println("Execelente ");
              break;
           case "B": 
               System.out.println("Otimo ");
               break;
           case "C": 
               System.out.println("Bom ");
               break;
           case "D":
               System.out.println("Regular ");
           case "E":
               System.out.println("Ruim ");
           case "F":
               System.out.println("Nos vemos no proximo ano ");
           default:
               System.out.println("Este conceito não existe");
        }
        
        
    }
}
