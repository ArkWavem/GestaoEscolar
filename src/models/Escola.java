package models;

import java.util.ArrayList;

public class Escola {

    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Escola(String nome) {
        this.nomeEscola = nomeEscola;
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listaDeAlunos() {
        System.out.println("Lista de Alunos da Escola");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public void listaDeProfessores() {
        System.out.println("Lista de Professores da Escola");
        for (Professor professor : professores) {
            System.out.println(professor);
        }
    }


    
}
