/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imparoupar;
import java.util.Scanner;

public class Imparoupar {

    public static void main(String[] args) {
       // System.out.println("Identificando valor impar ou par:");
        
        Scanner ler = new Scanner(System.in);
        
        double valor;
        
        System.out.println("Digite o valor que você deseja saber: ");
        valor = Double.parseDouble(ler.nextLine());
       
        if (valor%2==0){
            System.out.println("O valor é par");
        }
        else {
            System.out.println("O valor é impar");
        }
    }
}
