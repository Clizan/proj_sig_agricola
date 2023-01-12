/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;
import view.acesso;

/**
 *
 * @author clizanwillian
 */
public class usuarioDAO {

    private final Connection connection;

    public usuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {

        //Instrução SQL que será realizada
        String sql = "INSERT INTO agricola.ctrl_usuarios(usuario, senha) VALUES ('"+usuario.getUsuario()+"', '"+usuario.getSenha()+"')";

        //Preparando a conexão
        PreparedStatement stmt = connection.prepareStatement(sql);
        //Executando a instrução
        stmt.execute();
        //Encerrando a conexão
        connection.close();

    }
}
