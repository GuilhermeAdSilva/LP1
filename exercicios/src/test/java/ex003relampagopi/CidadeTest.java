package ex003relampagopi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarNome() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        assertEquals("Juiz de Fora", cidade.getNome());
    }

    @Test
    void deveRetornarExcecaoCidadeNula() {
        try {
            Estado estado = new Estado("MG");
            Cidade cidade = new Cidade(null, estado);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cidade invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado("MG");
        Cidade cidade = new Cidade("Juiz de Fora", estado);
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoEstadoNuloConstrutor() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora", new Estado(null));
            cidade.setEstado(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado Invalido", e.getMessage());
        }
    }

}