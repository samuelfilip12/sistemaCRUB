package com.projetos.ultra.sistemacrub.controller;

public class Usuario {
    private int id;
    private String login;
    private String senha;
    private String tipo;
    private String divisao;

    //contrutor
    public Usuario(){}

    //Getter e Setter
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
