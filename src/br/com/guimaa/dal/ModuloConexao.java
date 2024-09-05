/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guimaa.dal;

import java.sql.*;

/**
 *
 * @author matheus
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexão
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String user = "dba";
        String password = "Mateus9105";
        // estabelecendo a conexao com o banco
        try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url, user, password);
           return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
