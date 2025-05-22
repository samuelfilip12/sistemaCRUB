package com.projetos.ultra.sistemacrub.database;

import java.sql.Connection; // Para criar comandos SQL, transações etc.
import java.sql.DriverManager; // Para poder executar o etConnection(URL, USUARIO, SENHA);
import java.sql.SQLException; // Para capturar erros do banco de dados

public class conexao {
    private static final String URL = "jdbc:mysql://127.0.0.1/sistema";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() {
        try{ // Tenta se conectar ao banco.
            return DriverManager.getConnection(URL, USUARIO, SENHA); // Se der certo, retorna a conexão.
        }catch(SQLException e){
            System.out.println("Erro"+e.getMessage()); // Mostra no terminal o erro
            return null; // Se não conseguiu conectar, retorna null.
        }
    }
}
