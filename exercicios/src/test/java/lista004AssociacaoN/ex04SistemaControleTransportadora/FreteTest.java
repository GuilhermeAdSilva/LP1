package lista004AssociacaoN.ex04SistemaControleTransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Cliente cliente = new Cliente();
        Frete frete = new FreteNormal(cliente);
        frete.setNumero(1);
        assertEquals(1, frete.getNumero());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Cliente cliente = new Cliente();
        Frete frete = new FreteNormal(cliente);
        try {
            frete.setNumero(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarValorFreteNaoNegativo() {
        Cliente cliente = new Cliente();
        Frete frete = new FreteNormal(cliente);
        frete.setValorFrete(0);
        assertEquals(0, frete.getValorFrete());
    }

    @Test
    void deveLancarExcecaoValorFreteNegativo() {
        Cliente cliente = new Cliente();
        Frete frete = new FreteNormal(cliente);
        try {
            frete.setValorFrete(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete invalido", e.getMessage());
        }
    }

}