package lista003.SistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveVerificarBonusValido() {
        Diretor diretor = new Diretor(1, 0.01f);
        assertEquals(0.01f, diretor.getParticipacaoLucros());
    }

    @Test
    void deveVerificarBonusZeradoNegativo() {
        try {
            Diretor diretor = new Diretor(1, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Participacao em lucros invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularPagamento() {
        Diretor diretor = new Diretor(10, 1);
        assertEquals(11, diretor.calcularPagamento());
    }

}