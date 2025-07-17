package lista003.FormaGeometrica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveVerificarAlturaValida() {
        Retangulo retangulo = new Retangulo(0.1f, 0.1f);
        assertEquals(0.1f, retangulo.getAltura());
    }

    @Test
    void deveVerificarLarguraValida() {
        Retangulo retangulo = new Retangulo(0.1f, 0.1f);
        assertEquals(0.1f, retangulo.getLargura());
    }

    @Test
    void deveVerificarAlturaZeradaNegativa() {
        try {
            Retangulo retangulo = new Retangulo(0, 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarLarguraZeradaNegativa() {
        try {
            Retangulo retangulo = new Retangulo(1, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Largura invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea() {
        Retangulo retangulo = new Retangulo(1, 1);
        assertEquals(1, retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetro() {
        Retangulo retangulo = new Retangulo(1, 1);
        assertEquals(4, retangulo.calcularPerimetro());
    }
}