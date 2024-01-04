/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doadordesangue;
import java.util.Scanner;
        
public class Doadordesangue {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
     double peso, idade;
     
        System.out.println("Qual o seu peso: ");
        peso = Double.parseDouble(ler.nextLine());
        System.out.println("Qual a sua idade: ");
        idade = Double.parseDouble(ler.nextLine());
        
        if (peso>=55 && idade>=25){
            System.out.println("Você pode doar sangue.");
        }
        else{
            System.out.println("você não pode doar sangue.");
        }
    }
}
