/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor_array_execicio2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Vetor_array_execicio2 {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     int numeros[] = new int[5];
     int soma = 0;
     
     for (int i=0; i<numeros.length; i++){
         System.out.println("Digite o valor " + (i+1) + ":");
         numeros[i] = Integer.parseInt(ler.nextLine());
     }
     for (int i=0; i<numeros.length; i++){
         System.out.println("o valores são: " + numeros[i]);
         soma += numeros[i];
     }
         
    }
}
