
package com.projetos.ultra.sistemacrub;

import com.projetos.ultra.sistemacrub.database.conexao;

public class SistemaCRUB {

    public static void main(String[] args) {
        if (conexao.conectar() != null) {
            System.out.println("OK");
        }else{
            System.out.println("|--------|");
            System.out.println("|  Erro  |");
            System.out.println("|--------|");
        }
    }
}
