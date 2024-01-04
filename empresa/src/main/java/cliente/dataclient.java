/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class dataclient {
    // nome, endereço, cidade e estado 
    String nomeCliente, enderecoCliente, cidadeCliente, estadoCliente;
    Scanner ler = new Scanner(System.in);
 
public void dadosCliente(){
    System.out.println("Insira o nome do cliente: ");
    nomeCliente = ler.nextLine();
    System.out.println("Insira o endereço do cliente: ");
    enderecoCliente = ler.nextLine();
    System.out.println("Insira a cidade do cliente: ");
    cidadeCliente = ler.nextLine();
    System.out.println("Insira o estado de morada do cliente: ");
    estadoCliente = ler.nextLine();
    System.out.println("Nome: " + nomeCliente + "\n" +
                       "Endereço: " + enderecoCliente + "\n"+
                       "Cidade: " + cidadeCliente + "\n"+
                       "Estado: " + estadoCliente);   
}
    
    
}
