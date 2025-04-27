package lista001.ex004;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;
    @BeforeEach
    public void setUp() {
        carro = new Carro();
    }

    @Test
    public void deveCalcularMediaCombustivelGasto() {
        carro.setQuantidadeKmRodado(5.0f);
        carro.setQuantidadeKmConsumido(10.0f);
        assertEquals(2.0f, carro.calcularMediaCombustivelGasto());
    }

    @Test
    public void deveVerificarQuantidadeKmRodadosZerada() {
        try {
            carro.setQuantidadeKmRodado(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de Km rodados invalida!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarQuantidadeKmConsumidoNegativa() {
        try {
            carro.setQuantidadeKmConsumido(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de Km consumidos invalida!", e.getMessage());
        }
    }
}