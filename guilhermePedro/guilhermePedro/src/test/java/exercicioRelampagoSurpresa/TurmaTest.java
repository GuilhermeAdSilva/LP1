package exercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveAlocarUmAluno() {
        Disciplina disciplina = new Disciplina("LP1");
        Aluno aluno = new Aluno("Pedro");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        assertEquals(1,turma.numeroAlunos());
    }

    @Test
    void deveNaoAlocarContaRepetida(){
        Disciplina disciplina = new Disciplina("LP1");
        Aluno aluno = new Aluno("Pedro");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno);
        assertEquals(1,turma.numeroAlunos());
    }

    @Test
    void deveAlocarZeroAlunos() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        assertEquals(0,turma.numeroAlunos());
    }

    @Test
    void deveAlocarMaisDeUmAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno2);
        assertEquals(2,turma.numeroAlunos());
    }

    @Test
    void deveRetornarNomeProfessor(){
        Professor professor = new Professor("Marco");
        Disciplina disciplina = new Disciplina("LP1");
        Turma turma = new Turma(disciplina, professor);
        turma.setProfessor(professor);
        assertEquals("Marco", turma.getNomeProfessor());
    }

    @Test
    void deveEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        assertTrue(turma.verificarAluno(aluno));
    }

    @Test
    void deveNaoEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        assertFalse(turma.verificarAluno(aluno2));
    }

    @Test
    void deveDesalocarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno2);
        turma.desalocarAluno(aluno2);
        assertFalse(turma.verificarAluno(aluno2));
    }
}