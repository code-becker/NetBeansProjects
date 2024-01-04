/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploclasse;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class NovaClasse {
    double numero1;
    double numero2;
    double total;
    Scanner ler = new Scanner(System.in);
    // Criação metodo(Função)
   public void somaNumero(){ 
    System.out.println("Somando dois numeros" );
    System.out.println("Digite o 1º numero:  ");
    numero1 = ler.nextDouble();
    System.out.println("Digite o 1º numero:  ");
    numero2 = ler.nextDouble();
    
    total = numero1 + numero2;
    
    System.out.println("Total da soma: " + total);

} // fim do método somar
   
   public void subtraiNumero(){ 
    System.out.println("Subtraindo dois numeros " );
    System.out.println("Digite o 1º numero:  ");
    numero1 = ler.nextDouble();
    System.out.println("Digite o 1º numero:  ");
    numero2 = ler.nextDouble();
    
    total = numero1 - numero2;
    
    System.out.println("Total da soma: " + total);

} // Fim do método subtrair
    
}
