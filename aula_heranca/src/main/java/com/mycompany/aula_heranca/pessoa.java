/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_heranca;

/**
 *
 * @author luis
 */
public class pessoa {
    private String nome;
    private String cpf;
    //metodo construtor
    public void pessoa (String nome, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
   }
    //clique com o botão direito, vai em refactor e dps em encapsulate fild
    // select all e encapsulate

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprimir(){
        System.out.println("o nome é: " + this.nome);
        System.out.println("o cpf é: " + this.cpf);
    }
    
}
