import models.Aluno;
import models.Escola;
import models.Professor;

public class Main {
    public static void main(String[] args) {


        Escola escola =new Escola("Escola Senai");

        Aluno aluno1 = new Aluno("Carlos Silva", 15, "A123");
        Aluno aluno2 = new Aluno("Mariana Souza", 16, "A456");
        Aluno aluno3 = new Aluno("Maria Souza", 16, "B456");
        Aluno aluno4 = new Aluno("Pedro Souza", 26, "P456");

        Professor professor1 = new Professor("João Pereira", 55, "Matemática");
        Professor professor2 = new Professor("Ana Costa", 45, "Português");
        Professor professor3 = new Professor("Pedro Costa", 36, "Java");
        Professor professor4 = new Professor("Ana Maria", 47, "IOT");

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarAluno(aluno4);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.adicionarProfessor(professor3);
        escola.adicionarProfessor(professor4);

        escola.listaDeAlunos();
        escola.listaDeProfessores();

    }
}