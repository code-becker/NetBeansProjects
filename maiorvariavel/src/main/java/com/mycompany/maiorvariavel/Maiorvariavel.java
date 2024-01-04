/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiorvariavel;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Maiorvariavel {

    public static void main(String[] args) {
        System.out.println("Identificando o maior valor");
        
     Scanner ler = new Scanner(System.in);
     
     double num1, num2;
     
        System.out.println("Digite o Primeiro valor: ");
        num1 = Double.parseDouble(ler.nextLine());
        
        System.out.println("Digite o Segundo valor: ");
        num2 = Double.parseDouble(ler.nextLine());
    
        if (num1 > num2){
            System.out.println("O primeiro numero " + num1 + " é maior que o segundo " + num2);
        }
        else{
            System.out.println("O segundo numero " + num2 + " é maior que o primeiro " + num1);
        }
        }
                
     
     
             
             
    }
