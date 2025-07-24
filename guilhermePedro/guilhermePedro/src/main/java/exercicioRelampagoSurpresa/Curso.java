package exercicioRelampagoSurpresa;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
        this.alunos = new ArrayList<Aluno>();
    }

    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void alocarTurma(Turma turma) {
        if (!this.turmas.contains(turma)){
            this.turmas.add(turma);
        }
    }

    public boolean verificarTurma(Turma turma) {
        return this.turmas.contains(turma);
    }

    public void desalocarTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    public int numeroTurmas() {
        return (this.turmas.size());
    }

    public ArrayList<String> listaNomeProfessoresTurmas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Turma turma : turmas) {
            resultado.add(turma.getNomeProfessor());
        }
        return resultado;
    }

    public void alocarAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)){
            this.alunos.add(aluno);
        }
    }

    public boolean verificarAluno(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public void desalocarAluno(Aluno aluno) {
        this.alunos.remove(aluno);
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

    public ArrayList<String> getNomeDisciplinaTurma() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Turma turma : turmas) {
            resultado.add(turma.getNomeDisciplina());
        }
        return resultado;
    }
}