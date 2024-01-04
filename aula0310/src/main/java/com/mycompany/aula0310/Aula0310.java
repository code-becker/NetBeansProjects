/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0310;
import java.util.Scanner;
  // crie um programa em java que leia a idade do usuario e mostre se ele é maior ou menor de idade 

public class Aula0310 {

    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
      
      int idade;
        System.out.println("Informe a idade: ");
        idade = Integer.parseInt(entrada.nextLine());
        
        if (idade>=18){
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("menor de idade");
        }
        } 
    }
