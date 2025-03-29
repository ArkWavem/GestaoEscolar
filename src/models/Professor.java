package models;

public class Professor {
    private String nomeProfessor;
    private String disciplinaProfessor;
    private int idadeProfessor;

    public Professor(int idadeProfessor) {
        this.idadeProfessor = idadeProfessor;
    }

    public Professor(String nomeProfessor, String disciplinaProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }

    public int getIdadeProfessor() {
        return idadeProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", disciplinaProfessor='" + disciplinaProfessor + '\'' +
                ", idadeProfessor=" + idadeProfessor +
                '}';
    }
}
