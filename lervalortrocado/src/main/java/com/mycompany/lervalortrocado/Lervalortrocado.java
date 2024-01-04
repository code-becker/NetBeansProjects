/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lervalortrocado;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Lervalortrocado {

    public static void main(String[] args) {
        System.out.println("Ler os valores trocados");
        
        Scanner ler = new Scanner(System.in);
    
    double va, vb;
    
        System.out.println("Digite o valor A: ");
        va = Double.parseDouble(ler.nextLine());
        System.out.println("Digite o valor B: ");
        vb = Double.parseDouble(ler.nextLine());
        
        System.out.println("O valor digitado em valor A é: " + vb + ". O valor digitado em valor B é: " + va + "." );
    
    }
}
