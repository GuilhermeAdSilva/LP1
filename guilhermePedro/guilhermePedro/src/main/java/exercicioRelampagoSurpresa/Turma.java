package exercicioRelampagoSurpresa;

import java.util.ArrayList;

import java.util.ArrayList;

public class Turma {

    private Professor professor;
    private ArrayList<Aluno> alunos;
    private Disciplina disciplina;

    public Turma(Disciplina disciplina, Professor professor){
        this.alunos = new ArrayList<Aluno>();
        this.disciplina = disciplina;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getNomeProfessor(){
        return professor.getNome();
    }


    public void alocarAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)){
            this.alunos.add(aluno);
        }
    }

    public int numeroAlunos() {
        return (this.alunos.size());
    }

    public ArrayList<String> listaNomeAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            resultado.add(aluno.getNome());
        }
        return resultado;
    }

    public String getNomeDisciplina(){
        return disciplina.getNome();
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void desalocarAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

}