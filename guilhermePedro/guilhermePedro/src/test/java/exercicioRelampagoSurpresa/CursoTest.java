package exercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveAlocarUmaTurma() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        assertEquals(1,curso.numeroTurmas());
    }

    @Test
    void deveNaoAlocarTurmaRepetida(){
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        curso.alocarTurma(turma);
        assertEquals(1,curso.numeroTurmas());
    }

    @Test
    void deveAlocarZeroTurmas() {
        Curso curso = new Curso();
        assertEquals(0,curso.numeroTurmas());
    }

    @Test
    void deveAlocarMaisDeUmaTurma() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Turma turma1 = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        curso.alocarTurma(turma1);
        assertEquals(2,curso.numeroTurmas());
    }

    @Test
    void deveRetornarNomeProfessoresTurma(){
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Professor professor2 = new Professor("Sandro");
        Turma turma = new Turma(disciplina, professor);
        Turma turma1 = new Turma(disciplina, professor2);
        Curso curso = new Curso();
        turma.setProfessor(professor);
        turma1.setProfessor(professor2);
        curso.alocarTurma(turma);
        curso.alocarTurma(turma1);
        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("Marco");
        resultado.add("Sandro");
        assertEquals(resultado, curso.listaNomeProfessoresTurmas());
    }


    @Test
    void deveAlocarUmAluno() {
        Aluno aluno = new Aluno("Pedro");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        assertEquals(1,curso.numeroAlunos());
    }

    @Test
    void deveNaoAlocarAlunoRepetido(){
        Aluno aluno = new Aluno("Pedro");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno);
        assertEquals(1,curso.numeroAlunos());
    }

    @Test
    void deveAlocarZeroAlunos() {
        Curso curso = new Curso();
        assertEquals(0,curso.numeroTurmas());
    }

    @Test
    void deveAlocarMaisDeUmAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno2);
        assertEquals(2,curso.numeroAlunos());
    }

    /*@Test
    void deveRetornarNomeAlunosTurma(){
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Turma turma = new Turma();
        turma.alocarAluno(aluno);
        turma.alocarAluno(aluno2);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("Pedro");
        resultado.add("Guilherme");
        assertEquals(resultado, curso.listaNomeAlunosTurma());
    }*/

    @Test
    void deveRetornarNomeAlunos(){
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno2);
        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("Pedro");
        resultado.add("Guilherme");
        assertEquals(resultado, curso.listaNomeAlunos());
    }

    @Test
    void deveRetornarNomeDisciplinaTurma(){
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        turma.setDisciplina(disciplina);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add("LP1");
        assertEquals(resultado, curso.getNomeDisciplinaTurma());
    }

    @Test
    void deveEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        assertTrue(curso.verificarAluno(aluno));
    }

    @Test
    void deveNaoEncontrarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        assertFalse(curso.verificarAluno(aluno2));
    }

    @Test
    void deveEncontrarTurma() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Turma turma2 = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        assertTrue(curso.verificarTurma(turma));
    }

    @Test
    void deveNaoEncontrarTurma() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Turma turma2 = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma2);
        assertFalse(curso.verificarTurma(turma));
    }

    @Test
    void deveDesalocarTurma() {
        Disciplina disciplina = new Disciplina("LP1");
        Professor professor = new Professor("Marco");
        Turma turma = new Turma(disciplina, professor);
        Turma turma2 = new Turma(disciplina, professor);
        Curso curso = new Curso();
        curso.alocarTurma(turma);
        curso.alocarTurma(turma2);
        curso.desalocarTurma(turma2);
        assertFalse(curso.verificarTurma(turma2));
    }

    @Test
    void deveDesalocarAluno() {
        Aluno aluno = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Guilherme");
        Curso curso = new Curso();
        curso.alocarAluno(aluno);
        curso.alocarAluno(aluno2);
        curso.desalocarAluno(aluno2);
        assertFalse(curso.verificarAluno(aluno2));
    }

}