package lista004AssociacaoN.ex01SistemaArrecadaçãoIPTU;

import lista004AssociacaoN.ex01SistemaArrecadaçãoIPTU.Lote;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {
    @Test
    void deveAceitarMetragemMaiorQueZero() {
        Lote lote = new Lote();
        lote.setMetragemQuadradaTerreno(0.01f);
        assertEquals(0.01f, lote.getMetragemQuadradaTerreno());
    }

    @Test
    void deveLancarExcecaoMetragemZeradaNegativa() {
        try {
            Lote lote = new Lote();
            lote.setMetragemQuadradaTerreno(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Metragem invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorLote() {
        Lote lote = new Lote();
        lote.setMetragemQuadradaTerreno(10);
        assertEquals(300, lote.getValorImovel());
    }

}