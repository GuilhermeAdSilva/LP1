package lista002;

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
    public void deveVerificarDataAntiga() {
        try {
            carro.setAno(1885);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data invalida!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarDataFutura() {
        try {
            carro.setAno(2026);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ano invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarDataValida() {
        carro.setAno(1886);
        assertEquals(1886, carro.getAno());
        carro.setAno(2025);
        assertEquals(2025, carro.getAno());
    }

    @Test
    public void deveVerificarVelocidadeNegativa() {
        try {
            carro.setVelocidade_atual(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Velocidade invalida!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarVelocidadeValida() {
        carro.setVelocidade_atual(0);
        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    public void deveVerificarEstadoInvalido() {
        try {
            carro.setEstado("teste");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estado invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarEstadoLigado() {
        carro.setEstado("ligado");
        assertEquals("ligado", carro.getEstado());
        carro.setEstado("Ligado");
        assertEquals("ligado", carro.getEstado());
    }

    @Test
    public void deveVerificarEstadoDesligado() {
        carro.setEstado("desligado");
        assertEquals("desligado", carro.getEstado());
        carro.setEstado("Desligado");
        assertEquals("desligado", carro.getEstado());
    }

    @Test
    public void deveVerificarAcelerarDesligado() {
        try {
            carro.acelerar(10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao e possivel acelerar o carro desligado!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarAcelerarZerado() {
        try {
            carro.setEstado("ligado");
            carro.acelerar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de aceleracao invalido!", e.getMessage());
        }
    }

    @Test
    public void deveAcelerarCarro() {
        carro.setEstado("ligado");
        carro.acelerar(1);
        assertEquals(1, carro.getVelocidade_atual());
    }

    @Test
    public void deveVerificarFrearDesligado() {
        try {
            carro.frear(10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao e possivel frear o carro desligado!", e.getMessage());
        }
    }

    @Test
    public void devePararCarro() {
        carro.setEstado("ligado");
        carro.setVelocidade_atual(5);
        carro.frear(6);
        assertEquals(0, carro.getVelocidade_atual());
    }

    @Test
    public void deveFrearCarro() {
        carro.setEstado("ligado");
        carro.setVelocidade_atual(50);
        carro.frear(30);
        assertEquals(20, carro.getVelocidade_atual());
    }

    @Test
    public void deveVerifificarCarroLigado() {
        carro.setEstado("ligado");
        try {
            carro.ligar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro ja esta ligado!", e.getMessage());
        }
    }

    @Test
    public void deveLigarCarro() {
        carro.ligar();
        assertEquals("ligado", carro.getEstado());
    }

    @Test
    public void deveVerifificarCarroDesligado() {
        try {
            carro.desligar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O carro ja esta desligado!", e.getMessage());
        }
    }

    @Test
    public void deveDesligarCarro() {
        carro.setEstado("ligado");
        carro.desligar();
        assertEquals("desligado", carro.getEstado());
        assertEquals(0, carro.getVelocidade_atual());
    }
}