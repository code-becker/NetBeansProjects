/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class calculos {
    int numero1;
    int numero2;
    int total;
    Scanner ler = new Scanner(System.in);
    
    //public void é  metodo a ser executado, ele deve ser usado quando for subclasse
    public void somaNumeros(){
        System.out.println("Somando dois numeros: ");
        System.out.println("Digite o primeiro numero: ");
        numero1 = ler.nextInt();
        System.out.println("Digite o primeiro numero: ");
        numero2 = ler.nextInt();
        total = numero1 + numero2; 
        System.out.println("Resultado da soma: " + total);
    }
    public void cadastraAlunos(){
        String nomeAluno;
        String cidadeAluno;
        System.out.println("Nome do aluno: ");
        nomeAluno = ler.nextLine();
        System.out.println("Nome da cidade: ");
        cidadeAluno = ler.nextLine();
        
    
    }     
}
