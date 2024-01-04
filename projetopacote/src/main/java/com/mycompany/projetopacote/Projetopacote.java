/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetopacote;
// import operacoes.calculos é o msm que o scanner, você importa esse metodo para usar ele na classe principal
import operacoes.calculos;
/**
 *
 * @author luis
 */
public class Projetopacote {

    public static void main(String[] args) {
        //fala que em calculos cria uma variavel chamada calcular pra sempre chamar ela quando quiser executar a subclasse calculos 
        calculos calcular = new calculos();
        // dentro de calcular você pede para que seja executado o metodos somar numeros 
       calcular.somaNumeros();
       calcular.cadastraAlunos();
       
        
        
    }
}
