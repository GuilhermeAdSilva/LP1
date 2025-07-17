package ex003relampagopi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Escola escola = new Escola(cidade);
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Pos-doutorado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        escola.setDiretor(professor);
        assertEquals("Pos-doutorado", escola.retornarEscolaridadeDiretor());
    }

    @Test
    void deveRetornarDiretorSemEscolaridade() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        Escola escola = new Escola(cidade);
        Professor professor = new Professor();
        escola.setDiretor(professor);
        assertEquals("Pessoa sem escolaridade", escola.retornarEscolaridadeDiretor());
    }

}