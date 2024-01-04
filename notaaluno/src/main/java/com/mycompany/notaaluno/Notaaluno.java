/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notaaluno;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Notaaluno {

    public static void main(String[] args) {
        System.out.println("Media nota aluno!");
        
        Scanner ler = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, media;
        
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = Double.parseDouble(ler.nextLine());
        System.out.println("Digite a s segunda ta do aluno: ");
        nota2 = Double.parseDouble(ler.nextLine());
        System.out.println("Digite a terceira nota do aluno: ");
        nota3 = Double.parseDouble(ler.nextLine());
        System.out.println("Digite a quarta nota do aluno: ");
        nota4 = Double.parseDouble(ler.nextLine());
               
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Media das notas é " + media);
        
        if (media >= 70){
            System.out.println("O aluno está aprovado");
        }
        else {
            System.out.println("O aluno está reprovado");
        }
        
        
    }
}
