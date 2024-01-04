/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//6. Crie um programa em Java que o momento que o estoque se encontra:
// Estoque maior ou igual a 100 – “Estoque OK”
//Estoque entre 50 e menor que 100 – “Observe o estoque – ATENÇÃO”
// Estoque menor que 50 – “ Estado crítico” 
package com.mycompany.estoque;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Estoque {

    public static void main(String[] args) {
        System.out.println("Contabilidade de estoque");
        
        Scanner ler = new Scanner(System.in);
        
        String nome;
        int estoque;
        
        System.out.println("Digite o nome do produto: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a quantidade em estoque: ");
        estoque = Integer.parseInt(ler.nextLine());
        
        System.out.println(nome + " tem " + estoque + " de estoque");
        
        if (estoque >= 100){
            System.out.println("Estoque OK!");
        }
        if (estoque >= 50 && estoque < 100){
            System.out.println("Observe o estoque – ATENÇÃO");
        }
        if (estoque < 50){
            System.out.println("Estoque em estado crítico");
        }
        
    }
}
