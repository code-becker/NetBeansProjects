/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luis
 */
public class conexaoclass {
     public Connection getConexao() // entre parentes não tem nada – pq não recebe parâmetro
    {
        //try é como se fosse um verdadeiro e falso, nele é onde a conexão é realizada
        //caso a conexão de certa ele entra no try, se não der ele entra no catch
        try {
            //conection transfere a variável connection para con 
            //get serve para buscar informação, ex: se a versão é essa msm  e se a porta é a msm
            //"jdbc:mysql://localhost:3306/projetojava?serverTimezone=UTC
            //coloque seu localhost, e o nome do seu banco de dados o resto é padrão
            Connection con = DriverManager.getConnection( 
            "jdbc:mysql://localhost:3306/dbteste?serverTimezone=UTC", // linha de conexaoclass
            "root", // usuario, vc coloca o nome de usuário que você utiliza
            "Root@123" // senha
            );
             System.out.println("Conectado com sucesso "  );
             return con;
            
        } catch (SQLException e) {
            System.out.println("ERRO AO CONECTAR " + e.getMessage() );
            return null; 
    }}

}
