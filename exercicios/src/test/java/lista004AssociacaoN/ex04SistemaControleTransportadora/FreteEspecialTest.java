package lista004AssociacaoN.ex04SistemaControleTransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {
    @Test
    void deveAceitarTaxaEntregaNaoNegativo() {
        Cliente cliente = new Cliente();
        FreteEspecial frete = new FreteEspecial(cliente);
        frete.setTaxaEntrega(0);
        assertEquals(0, frete.getTaxaEntrega());
    }

    @Test
    void deveLancarExcecaoTaxaEntregaNegativa() {
        try {
            Cliente cliente = new Cliente();
            FreteEspecial frete = new FreteEspecial(cliente);
            frete.setTaxaEntrega(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoFrete() {
        Cliente cliente = new Cliente();
        FreteEspecial frete = new FreteEspecial(cliente);
        assertEquals("Frete Especial", frete.getTipoFrete());
    }

}