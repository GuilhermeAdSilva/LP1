package lista004AssociacaoN.ex04SistemaControleTransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {
    @Test
    void deveAceitarTaxaEntregaNaoNegativo() {
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente(cliente);
        frete.setTaxaEntrega(0);
        assertEquals(0, frete.getTaxaEntrega());
    }

    @Test
    void deveLancarExcecaoTaxaEntregaNegativa() {
        try {
            Cliente cliente = new Cliente();
            FreteUrgente frete = new FreteUrgente(cliente);
            frete.setTaxaEntrega(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarNumeroItensPositiva() {
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente(cliente);
        frete.setQuantidadeItens(1);
        assertEquals(1, frete.getQuantidadeItens());
    }

    @Test
    void deveLancarExcecaoNumeroItensZeradaNegativa() {
        try {
            Cliente cliente = new Cliente();
            FreteUrgente frete = new FreteUrgente(cliente);
            frete.setQuantidadeItens(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido de itens", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoFrete() {
        Cliente cliente = new Cliente();
        FreteUrgente frete = new FreteUrgente(cliente);
        assertEquals("Frete Urgente", frete.getTipoFrete());
    }

}