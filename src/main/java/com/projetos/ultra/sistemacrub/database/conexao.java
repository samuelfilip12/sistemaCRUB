package com.projetos.ultra.sistemacrub.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    private static final String URL = "jdbc:mysql://127.0.0.1/sistema";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() {
        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch(SQLException e){
            System.out.println("Erro"+e.getMessage());
            return null;
        }
    }
}
