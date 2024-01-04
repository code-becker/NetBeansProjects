/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariofuncionario;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Salariofuncionario {

    public static void main(String[] args) {
        System.out.println("Salario funcionario!");
    
        Scanner ler = new Scanner(System.in);
        
     double ht, vh, pd, sb, td, sl, st, bonus;
     
        System.out.println("Horas trabalhadas? ");
        ht = Double.parseDouble(ler.nextLine());
        
        System.out.println("Valor pago por hora? ");
        vh = Double.parseDouble(ler.nextLine());
        
        System.out.println("Qual o percental de desconto? ");
        pd = Double.parseDouble(ler.nextLine());
        
        sb = vh * ht;
        System.out.println("Salario bruto " + sb);
        
        td = (pd / 100) * sb;
        
        sl = (sb - td);
        System.out.println("O Salario liquido é " + sl);
        
        if (ht <= 160){
            bonus = 25;
            st = bonus + sl;    
            System.out.println("O Salario total adicionado o bonus de " + bonus + " é igual a " + st + "$");
        }
        if (ht > 160 && ht <= 250){
            bonus = 50;
            st = bonus + sl;
            System.out.println("O Salario total adicionado o bonus de " + bonus + " é igual a " + st + "$");           
        }
        if (ht > 250){
            bonus = 100;
            st = bonus + sl; 
            System.out.println("O Salario total adicionado o bonus de " + bonus + " é igual a " + st + "$");
        }
    }
}
