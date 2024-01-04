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
public class contaenergia {
    Scanner ler = new Scanner(System.in);
    int tipo, escolha;
    double calc, kwt;
    
    
    public void contaLuz(){
        System.out.println("""
                           Tipo de Cliente?
                           1 - (Residencia) 
                           2 - (Comercio) 
                           3 - (Industria) """);
        tipo = ler.nextInt();
        System.out.println("Qual foi o seu consumo de energia em kwts?");
        kwt = ler.nextDouble();
        
        switch(tipo){
            case 1:
                calc = (0.60 * kwt);
                System.out.println("Total da conta: R$" + calc);
                break;
            case 2: 
                calc = (0.48 * kwt);
                System.out.println("Total da conta: R$" + calc);
                break;
            case 3: 
                calc = (1.29 * kwt);
                System.out.println("Total da conta: R$" + calc); 
                break;
            default:
                System.out.println("O numero digitado está incorreto");   
        }
           System.out.println("""
                              Deseja realizar o pagamento? 
                              1 - sim
                              2 - não
                              """);
           escolha = ler.nextInt();
 
          if (escolha == 1){
              System.out.println("Pagamento realizado com sucesso: ");
          } else {
              System.out.println("Conta não paga: ");
          }
    }
}
