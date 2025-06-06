package com.projetos.ultra.sistemacrub.view;

import javax.swing.*;
import java.awt.*;


public class TelaAdmin extends JFrame {
    public TelaAdmin() {
        setTitle("Painel Administrativo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JLabel titulo = new JLabel("Painel Administrativo", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 32));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(titulo, BorderLayout.NORTH);

        //Botões
        JPanel painelCentral = new JPanel(new GridLayout(2, 2,30,30));
        painelCentral.setBorder(BorderFactory.createEmptyBorder(60, 100, 60,100));
        painelCentral.setBackground(Color.WHITE);

        //Botões do Menu
        JButton bntCadastrar = new JButton("Cadastrar");
        JButton bntConsultar = new JButton("Consultar");
        JButton bntEditor = new JButton("Editar");
        JButton bntDeletar = new JButton("Deletar");
        JButton bntLogOut = new JButton("LogOut");

        JButton[] botoes = {bntCadastrar, bntConsultar, bntDeletar, bntEditor};
        for (JButton bnt : botoes ){
            bnt.setFont(new Font("Arial", Font.PLAIN, 24));
            bnt.setBackground(new Color(39,144,255));
            bnt.setForeground(Color.WHITE);
            bnt.setFocusPainted(false);
            painelCentral.add(bnt);
        }

        // Botão LogOut
        bntLogOut.setFont(new Font("Arial", Font.PLAIN, 20));
        bntLogOut.setBackground(new Color(220, 20, 60));
        bntLogOut.setForeground(Color.WHITE);
        bntLogOut.setFocusPainted(false);

        // deixar ele no rodapé da tela
        JPanel rodape = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rodape.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        rodape.add(bntLogOut);
        add(rodape, BorderLayout.SOUTH);

        add(painelCentral, BorderLayout.CENTER);

        // Eventos dos botões (exemplo)
        bntCadastrar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Função Criar"));
        bntConsultar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Função Consultar"));
        bntEditor.addActionListener(e -> JOptionPane.showMessageDialog(this, "Função Editar"));
        bntDeletar.addActionListener(e -> JOptionPane.showMessageDialog(this, "Função Deletar"));

        bntLogOut.addActionListener(e -> {
            dispose();
            new TelaAdmin();
            setVisible(false);
        }
        );


        setVisible(true);


    }    
}
