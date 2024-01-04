/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provaa1vendabilhetes;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Provaa1vendabilhetes {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Máquina de Venda de Bilhetes!");
        
        Scanner ler = new Scanner(System.in);
        //Esse código abaixo é o reponsavél por mostrar a mensagem falando dos bilhetes e dos valores
        //Nesse mesmo codigo eu solicitei que fosse indicado o numero do bilhete desejado
        System.out.println(" 1 - Bilhete único: R$ 4,00\n " +
                            "2 - Bilhete mensal: R$ 40,00\n " +
                            "3 - Bilhete diário: R$ 10,00 \n" +
                            "Escolha um numero acima referente ao bilhete que você quer: ");
       //Coloquei a variavel que irá receber o valor
        int numero = ler.nextInt();
        //Solicito que a pessoa entre com o valor em dinheiro que ela irá colocar na maquina
        System.out.println("Digite o valor exato em dinheiro: ");
        double valor = ler.nextDouble();
        //Criei a opção de casos onde vai ser verificado o valor que a pessoa vai colocar e se esse valor é o suficiente
        //Nesse mesmo campo através do valor que foi colocado na variavel numero eu indico o bilhete que foi comprado
        switch (numero){
           case 1:
               if (valor == 4.00){
              System.out.println("Parabéns, você comprou o bilhete único ");
               }
               if (valor < 3.99){
               System.out.println("O valor inserido não é o sulficiente, insira mais dinheiro ");
               }
              break;
           case 2: 
               if (valor == 40.00){
               System.out.println("Parabéns, você comprou o bilhete mensal ");
               }
               if (valor < 39.99){
               System.out.println("O valor inserido não é o sulficiente, insira mais dinheiro ");
               }
               break;
           case 3: 
               if (valor == 10.00){
               System.out.println("Parabéns, você comprou o bilhete diário ");
               }
               if (valor < 9.99){
               System.out.println("O valor inserido não é o sulficiente, insira mais dinheiro ");
               }
               break;
               //O default retorna uma resposta caso o numero digitado seja diferente das opções
           default:
               System.out.println("Não existe nenhum numero correspondente ao numero escolhido! "
                       + " Digite um numero de 1 a 3: ");
        }            
    }
}
