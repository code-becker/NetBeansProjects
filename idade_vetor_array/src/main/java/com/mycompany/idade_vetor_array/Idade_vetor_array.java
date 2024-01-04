/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.idade_vetor_array;

/**
 *
 * @author luis
 */
public class Idade_vetor_array {

    public static void main(String[] args) {
        String[] idade = {"10", "20", "30", "40", "50"};
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        System.out.println("O tamanho do vetor idade é: " + idade.length);
        System.out.println("O tamanho do vetor mês é: " + mes.length);
        
        
     for (int i=0; i<idade.length; i++){
         System.out.println("As idades que estão no vetor são: " + idade[i]);
     }
     for (int m=0; m<mes.length; m++){
         System.out.println("Os meses que estão no vetor são: " + mes[m]);
     }    
    }
}
