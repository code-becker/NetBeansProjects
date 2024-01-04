/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author luis
 */
public class Arrays {
// arrays serve para deixar o programa mais leve pois ele separa um espaço na memoria 
// para aquelas determinadas variaveis 
    public static void main(String[] args) {
    String[] carros = {"Fusca","Uno", "palio", "s10", "onix", "pampa"};
    //o comando length mostra o tamanho do vetor de carros
        System.out.println("O tamanho do meu vetor é: " + carros.length);
        System.out.println("-----------------------------------------");
        // o valor dentro do [] é a posição que vc deseja ver 
        //System.out.println("O carro na posição desejada é: " + carros[0]);
        
        // for nesse modelo ele serve para comparar e contar, criamos uma variavel chamada i do tipo inteiro
        // essa variavel é do tipo inteiro então eu declaro que i=0 para comparar que o valor 
        // inicial de i é 0, depois coloco que i<carros.length, quer dizer i tem que ser menor que o numero 
        // maximo de dados dentro do nosso vetor, depois o i++ soma ao valor de i sempre mais um e exibe
        // o resultado logo abaixo
        for (int i=0; i<carros.length; i++){
            System.out.println("Carros cadastrados no sistema: " + carros[i]);
        }
    }
}
