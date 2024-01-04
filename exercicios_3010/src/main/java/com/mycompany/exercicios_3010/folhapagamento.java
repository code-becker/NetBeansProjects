/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios_3010;

import java.util.Scanner;

/**
 *
 * @author luis
 */
class folhapagamento {
    Scanner ler = new Scanner(System.in);
    double sb, sl, hrsnormal, hrsextra, hn, he;
    double dsct=0.90;
    
    public void empresaTabajara(){
        System.out.println("A empresa Tabajara paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra");
        System.out.println("Quantas horas normais foram trabalhadas: ");
        hrsnormal = ler.nextDouble();
        System.out.println("Quantas horas extras foram trabalhadas: ");
        hrsextra = ler.nextDouble();
        hn = hrsnormal * 10;
        he = hrsextra * 15;
        
        sb = hn + he;
        System.out.println("O salario bruto é: " + sb + "$");
        sl = sb * dsct;
        System.out.println("O salario liquido é: " + sl + "$");
    }   
}
