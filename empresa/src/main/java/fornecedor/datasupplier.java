/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fornecedor;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class datasupplier {
    // nome, telefone, cidade e estado
    String nomeFornecedor, telefoneFornecedor, cidadeFornecedor, estadoFornecedor;
    Scanner ler = new Scanner(System.in);
    
    public void dadosFornecedor(){
    System.out.println("Insira o nome do fornecedor: ");
    nomeFornecedor = ler.nextLine();
    System.out.println("Insira o telefone do fornecedor: ");
    telefoneFornecedor = ler.nextLine();
    System.out.println("Insira a cidade do fornecedor: ");
    cidadeFornecedor = ler.nextLine();
    System.out.println("Insira o estado de morada do fornecedor: ");
    estadoFornecedor = ler.nextLine();
    System.out.println("Nome: " + nomeFornecedor + "\n" +
                       "telefone: " + telefoneFornecedor + "\n"+
                       "Cidade: " + cidadeFornecedor + "\n"+
                       "Estado: " + estadoFornecedor);   
}
    
    
}
