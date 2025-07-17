package lista003.FormaGeometrica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveVerificarRaioValido() {
        Circulo circulo = new Circulo(0.1f);
        assertEquals(0.1f, circulo.getRaio());
    }

    @Test
    void deveVerificarRaioZeradoNegativo() {
        try {
            Circulo circulo = new Circulo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Raio invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea() {
        Circulo circulo = new Circulo(1);
        assertEquals(3.14, circulo.calcularArea(), 0.01);
    }

    @Test
    void deveCalcularPerimetro() {
        Circulo circulo = new Circulo(1);
        assertEquals(6.28, circulo.calcularPerimetro(), 0.01);
    }

}