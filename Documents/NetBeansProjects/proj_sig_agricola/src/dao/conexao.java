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
    
    public static conexao getConexao() {

        String user = "root";
        String pass = "";
        String db = "loja";

        conexao conn = null;

        try {

            conn = (conexao) DriverManager.getConnection("jdbc:mysql://localhost:3306/loja", "root", "");

        } catch (Exception e) {

            System.out.println("Erro ao conectar");
        }

        return conn;

    }
    
}
