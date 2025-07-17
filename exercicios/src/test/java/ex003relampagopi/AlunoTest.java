package ex003relampagopi;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarCidade() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Aluno aluno = new Aluno();
        aluno.setCidade(cidade);
        assertEquals("Juiz de Fora", aluno.getNomeCidade());
    }

    @Test
    void deveRetornarEstado() {
        Estado estado = new Estado("MG");
        Aluno aluno = new Aluno();
        aluno.setEstado(estado);
        assertEquals("MG", aluno.getNomeEstado());
    }

    @Test
    void deveRetornarNaturalidade() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Aluno aluno = new Aluno();
        aluno.setCidade(cidade);
        aluno.setEstado(estado);
        assertEquals("Juiz de Fora, MG", aluno.retornarNaturalidade());
    }

    @Test
    void deveRetornarCoodernador() {
        Professor professor = new Professor();
        professor.setNome("Marco");
        Curso curso = new Curso();
        curso.setCoodernador(professor);
        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        assertEquals("Marco", aluno.retonaCoodernador());
    }

}