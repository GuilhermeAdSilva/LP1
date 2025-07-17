package ex003relampagopi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarEscolaridadeCoodeernador() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Mestrado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        Curso curso = new Curso();
        curso.setCoodernador(professor);
        assertEquals("Mestrado", curso.escolaridadeCoodernador());
    }

    @Test
    void deveRetornarCoodeernadorSemEscolaridade() {
        Professor professor = new Professor();
        Curso curso = new Curso();
        curso.setCoodernador(professor);
        assertEquals("Pessoa sem escolaridade", curso.escolaridadeCoodernador());
    }
}