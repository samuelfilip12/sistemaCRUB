package com.projetos.ultra.sistemacrub.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.projetos.ultra.sistemacrub.controller.Usuario;
import com.projetos.ultra.sistemacrub.dao.usuarioDAO;

public class TelaLogin extends JFrame {

    private JTextField reb_Login;
    private JPasswordField reb_Senha;

    public TelaLogin() {
        setTitle("Sistema de Login");
        setLayout(null);
        setSize(500, 300);
        
        //Para criar o painel principal 
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(150, 30, 300, 200); //Posição e Tamanho;
        painel.setBorder(BorderFactory.createTitledBorder("Login"));
        add(painel);

        //Titulo Usuário;
        JLabel lb_usuario = new JLabel("Usuário:");
        lb_usuario.setBounds(20, 30, 60, 25);
        painel.add(lb_usuario);
        //Reber Usuário
        reb_Login = new JTextField();
        reb_Login.setBounds(90, 30, 180, 25);
        painel.add(reb_Login); 

        //Titulo Senha
        JLabel lb_senha = new JLabel("Senha:");
        lb_senha.setBounds(20, 65, 60, 25);
        painel.add(lb_senha);
        //Rebecer Senha
        reb_Senha = new JPasswordField();
        reb_Senha.setBounds(90, 65, 180, 25);
        painel.add(reb_Senha);

        // Botão Entrar para a função entrar
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(40, 140, 100, 30);
        painel.add(btnEntrar);

        // Botão Sair para a função sair
        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(180, 140, 100, 30);
        painel.add(btnSair);

        btnSair.addActionListener(new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Direcionamento 

        btnEntrar.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuarioDAO dao = new usuarioDAO();
                String login = reb_Login.getText();
                String senha = new String(reb_Senha.getPassword());

                Usuario usuarioLogado =dao.autenticar(login, senha);

                if (usuarioLogado != null) {
                    if (usuarioLogado.getTipo().equalsIgnoreCase("admin")) {
                        new TelaAdmin().setVisible(true);
                    }else{
                        new TelaComum().setVisible(true);
                    }
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuário ou senha invalidos");
                }
            }
        }));
    
        setVisible(true);
    }
}


