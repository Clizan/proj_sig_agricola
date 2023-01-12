/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author clizanwillian
 */
public class conexao {
    
    public static Connection getConexao() {

        String user = "root";
        String pass = "";
        String db = "loja";

        Connection conn = null;

        try {

            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/agricola", "root", "");

        } catch (Exception e) {

            System.out.println("Erro ao conectar");
        }

        return conn;

    }
    
}
