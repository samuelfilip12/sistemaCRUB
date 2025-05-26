package com.projetos.ultra.sistemacrub.view;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaComum extends JFrame {
    public TelaComum() {
        setTitle("Usuário Comum");
        setLayout(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        //Para criar o painel principal 
        JPanel painel = new JPanel();
        add(painel);

        setVisible(true);
    }
}