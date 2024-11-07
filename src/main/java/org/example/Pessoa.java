package org.example;

public class Pessoa {
    public String nome;
    public boolean temAgendamento;
    public boolean temBSE;
    public float creditos;

    public Pessoa(String nome, boolean temAgendamento, float creditos, boolean temBSE) {
        this.nome = nome;
        this.temAgendamento = temAgendamento;
        this.temBSE = temBSE;
        this.creditos = creditos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getTemAgendamento() {
        return temAgendamento;
    }

    public void setTemAgendamento(boolean temAgendamento) {
        this.temAgendamento = temAgendamento;
    }

    public boolean getTemBSE() {
        return temBSE;
    }

    public void setTemBSE(boolean temBSE) {
        this.temBSE = temBSE;
    }

    public float getCreditos() {
        return creditos;
    }

    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

    public void exibirInformacoesPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("Tem Agendamento: " + getTemAgendamento());
        System.out.println("Créditos: " + getCreditos());
        System.out.println("Possui BSE: " + getTemBSE());
    }
}
