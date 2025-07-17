package lista003.SistemaPassagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveAceitarTaxaConversao() {
        VooInternacional vooInternacional = new VooInternacional("Madri", 1f, "Amsterda", "07-09-2030", 1, 0.01f);
        assertEquals(0.01f, vooInternacional.getTaxaConversao());
    }

    @Test
    void deveVerificarTaxaConversaoZeradaNegativa() {
        try {
            VooInternacional vooInternacional = new VooInternacional("Madri", 1f, "Amsterda", "07-09-2030", 1, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de conversao invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco() {
        VooInternacional vooInternacional = new VooInternacional("Madri", 1f, "Amsterda", "07-09-2030", 1, 1);
        assertEquals(2, vooInternacional.calcularPreco());
    }

}