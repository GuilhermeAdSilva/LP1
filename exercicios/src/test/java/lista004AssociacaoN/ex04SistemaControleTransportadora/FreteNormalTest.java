package lista004AssociacaoN.ex04SistemaControleTransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteNormalTest {
    @Test
    void deveRetornarTipoFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente);
        assertEquals("Frete Normal", frete.getTipoFrete());
    }

}