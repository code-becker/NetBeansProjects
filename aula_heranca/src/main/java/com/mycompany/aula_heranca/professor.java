/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_heranca;

/**
 *
 * @author luis
 */
//extends é palavra reservada qe fala que a classe professor 
// vai pegar as variaveis declaradas lá
public class professor extends pessoa {
    private double salario;
    private String disciplina;
    
public professor (String nome, String cpf, double salario, String disciplina){    
        // super palavra reservada fala que vc vai pegar as variaveis da classe pai 
        super();
        // aqui eu declaro que a variavel salario é igual salario 
        this.salario = salario;
        this.disciplina = disciplina;
      
 }
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void imprimir(){
        System.out.println("o nome é: " + this.salario);
        System.out.println("o cpf é: " + this.disciplina);
    } 
}
    

