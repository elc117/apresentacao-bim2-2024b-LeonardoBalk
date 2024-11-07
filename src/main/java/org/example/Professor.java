package org.example;

public class Professor extends Pessoa {
    private String departamento;
    private String siape;

    public Professor(String nome, boolean temAgendamento, float creditos, boolean temBSE, String departamento, String siape) {
        super(nome, temAgendamento, creditos, temBSE);
        this.departamento = departamento;
        this.siape = siape;
        this.temBSE = false;  // Professor não tem BSE
    }

    private String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    private boolean temCreditos(float credito) {
        if(credito >= 14) {
            return true;
        }
        return false;
    }

    public boolean podeAlmocar(float n) {
        if(temAgendamento && (temBSE || temCreditos(n))) {
            return true;
        }
        return false;
    }

    public void almocou(boolean podeAlmocar) {
        if(podeAlmocar) {
            System.out.println("Almocou!");
                creditos -= 14;
            }
         else {
             if(!temCreditos(creditos) && temAgendamento) {
                 System.out.println("Não foi possível almoçar, professor (a) " + " não tem créditos.");
             }
            if(!temCreditos(creditos) && !temAgendamento) {
                System.out.println("Não foi possível almoçar, professor (a) " + " não tem agendamento e créditos.");
            }
            if(temCreditos(creditos) && !temAgendamento) {
                System.out.println("Não foi possível almoçar, professor (a) " + " não tem agendamento.");
            }
        }
    }

    public void exibirInformacoes() {
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("SIAPE: " + getSiape());
        System.out.println("\n");
    }
}
