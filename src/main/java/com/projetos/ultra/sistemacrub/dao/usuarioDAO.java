package com.projetos.ultra.sistemacrub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.projetos.ultra.sistemacrub.controller.Usuario;
import com.projetos.ultra.sistemacrub.database.conexao;

public class usuarioDAO {
    public Usuario autenticar(String login, String senha) {
        String sql = "SELECT * FROM users WHERE login = ? AND senha = ?";

        try (Connection conn = conexao.conectar();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            
            stmt.setString(1, login);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id_user"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setTipo(rs.getString("tipo"));
                return usuario;
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao autenticar: " + e.getMessage());
        }
        return null;
    }
}
