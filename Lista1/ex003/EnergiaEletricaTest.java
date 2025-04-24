package org.ex003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnergiaEletricaTest {
    EnergiaEletrica conta;

    @BeforeEach
    public void getUp() {
        conta = new EnergiaEletrica();
    }

    @Test
    public void deveCalcularValorContaEnergia() {
        conta.setQuantidadeQuilowatt(100);
        assertEquals(14.16f, conta.calcularValorContaEnergia());
    }

}