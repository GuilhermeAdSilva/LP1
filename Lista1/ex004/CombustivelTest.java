package org.ex004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombustivelTest {
    Combustivel combustivel;

    @BeforeEach
    public void getUp() {
        combustivel = new Combustivel();
    }

    @Test
    public void deveCalcularMediaCombustivelGasto() {
        combustivel.setQuantidadeCombustivelConsumido(100);
        combustivel.setQuantidadeKmRodado(5);
        assertEquals(20, combustivel.calcularMediaCombustivelGasto());
    }

}