/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o driver
        String driver = "com.mysql.jdbc.Driver";
        // informações referente a banco
        String url = "jdbc:mysql://localhost:3306/infox";
        String user = "root";
        String password = "";
//estabelece conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;    
        }
    }
}
