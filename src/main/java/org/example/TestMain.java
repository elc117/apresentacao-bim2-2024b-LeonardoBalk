package org.example;

public class TestMain {
    public static void main(String[] args) {
        // Cria instâncias de Aluno
        Aluno aluno1 = new Aluno("Neymar Jr", "1010101010", "Sistemas de Informação", true, 4.0f, false);
        Aluno aluno2 = new Aluno("Joao Silva", "2020202020", "Engenharia Civil", false, 3.5f, true);
        Aluno aluno3 = new Aluno("Gabriel Oliveira", "30303030", "Arquitetura e Urbanismo", true, 2.0f, true);

        // Exibe as informações e verifica se o aluno pode almoçar (Aluno 1)
        System.out.println("Informações do Aluno (a) 1:");
        aluno1.exibirInformacoesPessoa(); // Exibe as informações básicas da pessoa
        aluno1.exibirInformacoes(); // Exibe informações específicas do aluno
        System.out.println("Aluno (a) " + aluno1.nome + " pode almoçar? " + aluno1.podeAlmocar(3.0f)); // Verifica se o aluno pode almoçar
        aluno1.almocou(aluno1.podeAlmocar(aluno1.creditos)); // Processa o almoço do aluno
        System.out.println("Créditos: R$" + aluno1.creditos); // Exibe os créditos restantes
        System.out.println("\n");

        // Exibe as informações e verifica se o aluno pode almoçar (Aluno 2)
        System.out.println("Informações do Aluno (a) 2:");
        aluno2.exibirInformacoesPessoa();
        aluno2.exibirInformacoes();
        System.out.println("Aluno (a) " + aluno2.nome + " pode almoçar? " + aluno2.podeAlmocar(3.0f));
        aluno2.almocou(aluno2.podeAlmocar(aluno2.creditos));
        System.out.println("Créditos: R$" + aluno2.creditos);
        System.out.println("\n");

        // Exibe as informações e verifica se o aluno pode almoçar (Aluno 3)
        System.out.println("Informações do Aluno (a) 3:");
        aluno3.exibirInformacoesPessoa();
        aluno3.exibirInformacoes();
        System.out.println("Aluno (a) " + aluno3.nome + " pode almoçar? " + aluno3.podeAlmocar(3.0f));
        aluno3.almocou(aluno3.podeAlmocar(aluno3.creditos));
        System.out.println("Créditos: R$" + aluno3.creditos);
        System.out.println("\n");

        // Cria instâncias de Professor
        Professor professor1 = new Professor("Andrea Schwertner Charão", true, 6.0f, true, "Departamento de Linguagens e Sistemas de Computação", "2424252");
        Professor professor2 = new Professor("Gilnei Costa", false, 5.0f, false, "Departamento de Matemática", "3187543");
        Professor professor3 = new Professor("Luciana Almeida", true, 50.0f, true, "Departamento de Engenharia Elétrica", "8425639");

        // Exibe as informações e verifica se o professor pode almoçar (Professor 1)
        System.out.println("Informações do Professor (a) 1:");
        professor1.exibirInformacoesPessoa(); // Exibe as informações básicas do professor
        professor1.exibirInformacoes(); // Exibe informações específicas do professor
        System.out.println("Professor (a) " + professor1.nome + " pode almoçar? " + professor1.podeAlmocar(professor1.creditos)); // Verifica se o professor pode almoçar
        professor1.almocou(professor1.podeAlmocar(professor1.creditos)); // Processa o almoço do professor
        System.out.println("Créditos: R$" + professor1.creditos); // Exibe os créditos restantes
        System.out.println("\n");

        // Exibe as informações e verifica se o professor pode almoçar (Professor 2)
        System.out.println("Informações do Professor (a) 2:");
        professor2.exibirInformacoesPessoa();
        professor2.exibirInformacoes();
        System.out.println("Professor (a) " + professor2.nome + " pode almoçar? " + professor2.podeAlmocar(professor2.creditos));
        professor2.almocou(professor2.podeAlmocar(professor2.creditos));
        System.out.println("Créditos: R$" + professor2.creditos);
        System.out.println("\n");

        // Exibe as informações e verifica se o professor pode almoçar (Professor 3)
        System.out.println("Informações do Professor (a) 3:");
        professor3.exibirInformacoesPessoa();
        professor3.exibirInformacoes();
        System.out.println("Professor (a) " + professor3.nome + " pode almoçar? " + professor3.podeAlmocar(professor3.creditos));
        professor3.almocou(professor3.podeAlmocar(professor3.creditos));
        System.out.println("Créditos: R$" + professor3.creditos);
        System.out.println("\n");
    }
}
