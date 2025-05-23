package com.projetos.ultra.sistemacrub.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaLogin extends JFrame {
    public telaLogin() {
        setTitle("Sistema de Login");
        JFrame frame = new JFrame("Login do Sistema");
        setLayout(null);
        setSize(500, 300);
        
        //Para criar o painel principal 
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(150, 30, 300, 200); //Posição e Tamanho;
        painel.setBorder(BorderFactory.createTitledBorder("Login"));
        add(painel);

        // Estilizar com uma imagem;
        JLabel logo_projeto = new JLabel(new ImageIcon(""));
        logo_projeto.setBounds(20, 50, 100, 100);
        add(logo_projeto);

        //Titulo Usuário;
        JLabel lb_usuario = new JLabel("Usuário:");
        lb_usuario.setBounds(20, 30, 60, 25);
        painel.add(lb_usuario);
        //Reber Usuário
        JTextField reb_usuario = new JTextField();
        reb_usuario.setBounds(90, 30, 180, 25);
        painel.add(reb_usuario);

        //Titulo Senha
        JLabel lb_senha = new JLabel("Senha:");
        lb_senha.setBounds(20, 65, 60, 25);
        painel.add(lb_senha);
        //Rebecer Senha
        JPasswordField reb_senha = new JPasswordField();
        reb_senha.setBounds(90, 65, 180, 25);
        painel.add(reb_senha);

        // Botão Entrar para a função entrar
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(40, 140, 100, 30);
        painel.add(btnEntrar);

        // Botão Sair para a função sair
        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(180, 140, 100, 30);
        painel.add(btnSair);

        btnSair.addActionListener(e -> System.exit(0));

        setVisible(true);

    }
}
