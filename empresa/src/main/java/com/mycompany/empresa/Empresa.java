/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empresa;
//primeiro você chama o package dps vc chama a classe
import cliente.dataclient;
import fornecedor.datasupplier;
/**
 *
 * @author luis
 */
public class Empresa {

    public static void main(String[] args) {
        dataclient dtaclient = new dataclient(); 
        datasupplier dtasupplier = new datasupplier(); 
       // dtaclient.dadosCliente();
        dtasupplier.dadosFornecedor();
        
    }
}
