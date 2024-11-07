package org.example;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso, boolean temAgendamento, float creditos, boolean temBSE) {
        super(nome, temAgendamento, creditos, temBSE);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    private boolean temCreditos (float credito){
        if(credito >= 2.50){
            return true;
        }

        return false;
    }

    public boolean podeAlmocar(float n){
        if(temAgendamento && (temBSE || temCreditos(n))){
            return true;
        }
        return false;
    }

    public void almocou(boolean podeAlmocar) {
        if(podeAlmocar) {
            if(!temBSE) {
                creditos -= 2.5;
            }
            System.out.println("Almocou!");
            this.temAgendamento = false;
        }
        else {
            if(!temCreditos(creditos) && temAgendamento) {
                System.out.println("Não foi possível almoçar, aluno (a) " + " não tem créditos.");
            }
            if(!temCreditos(creditos) && !temAgendamento) {
                System.out.println("Não foi possível almoçar, aluno (a) " + " não tem agendamento e créditos.");
            }
            if(temCreditos(creditos) && !temAgendamento) {
                System.out.println("Não foi possível almoçar, aluno (a) " + " não tem agendamento.");
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + getCurso());
        System.out.println("Matricula: " + getMatricula());
        System.out.println("\n");
    }
}

