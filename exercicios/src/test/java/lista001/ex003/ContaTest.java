package lista001.ex003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    Conta conta;
    @BeforeEach
    public void setUp() {
        conta = new Conta();
    }

    @Test
    public void deveCalcularValorContaEnergia() {
        conta.setQuilowattsConsumido(100);
        assertEquals(14.16f, conta.calcularContaEnergiaEletrica());
    }

    @Test
    public void deveVerificarQuilowattNegativo() {
        try {
            conta.setQuilowattsConsumido(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido de quilowatts!", e.getMessage());
        }
    }

}