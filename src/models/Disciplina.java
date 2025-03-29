package models;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private Professor professor;

    // Construtor padrão
    public Disciplina() {}

    public Disciplina(String nome, int cargaHoraria, Professor professor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }
}
