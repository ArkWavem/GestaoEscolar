package models;

import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private int anoLetivo;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    // Construtor padrão
    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public Turma(String nomeTurma, int anoLetivo, Professor professor, ArrayList<Aluno> alunos) {
        this.nomeTurma = nomeTurma;
        this.anoLetivo = anoLetivo;
        this.professor = professor;
        this.alunos = alunos;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
