package lista003.SistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveVerificarBonusValido() {
        Gerente gerente = new Gerente(1, 0.01f);
        assertEquals(0.01f, gerente.getBonusFixo());
    }

    @Test
    void deveVerificarBonusZeradoNegativo() {
        try {
            Gerente gerente = new Gerente(1, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Bonus invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPagamento() {
        Gerente gerente = new Gerente(10, 1);
        assertEquals(11, gerente.calcularPagamento());
    }
}