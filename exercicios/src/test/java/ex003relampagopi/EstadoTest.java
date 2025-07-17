package ex003relampagopi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {

    @Test
    void deveRetornarNome() {
        Estado estado = new Estado("MG");
        assertEquals("MG", estado.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeNulo() {
        try {
            Estado estado = new Estado(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estado Invalido", e.getMessage());
        }
    }

}