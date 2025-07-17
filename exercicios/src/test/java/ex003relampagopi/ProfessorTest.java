package ex003relampagopi;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        assertEquals("Doutorado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor();
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarCidade() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Professor professor = new Professor();
        professor.setCidade(cidade);
        assertEquals("Juiz de Fora", professor.getNomeCidade());
    }

    @Test
    void deveRetornarTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino();
        tipoEnsino.setNome("Graduacao");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);
        Professor professor = new Professor();
        professor.setCurso(curso);
        assertEquals("Graduacao", professor.retornaTipoCursoProfessor());
    }

    @Test
    void deveRetornarDiretor() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Escola escola = new Escola(cidade);
        Professor diretor = new Professor();
        diretor.setNome("Marco");
        escola.setDiretor(diretor);
        Curso curso = new Curso();
        curso.setEscola(escola);
        Professor professor = new Professor();
        professor.setCurso(curso);
        assertEquals("Marco", professor.retornaDiretor());
    }

    @Test
    void deveRetornarCoodernador() {
        Professor coodernador = new Professor();
        coodernador.setNome("Marco");
        Curso curso = new Curso();
        curso.setCoodernador(coodernador);
        Professor professor = new Professor();
        professor.setCurso(curso);
        assertEquals("Marco", professor.retornaCoodernador());
    }

}