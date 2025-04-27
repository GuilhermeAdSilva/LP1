package lista002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;
    @BeforeEach
    public void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void deveTestarIdadeNegativa() {
        try {
            pessoa.setIdade(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Idade invalida", e.getMessage());
        }
    }

    @Test
    public void deveTestarAlturaNegativa() {
        try {
            pessoa.setAltura(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    public void deveTestarPesoNegativo() {
        try {
            pessoa.setPeso(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso invalido", e.getMessage());
        }
    }

    @Test
    public void deveEnvelhecer() {
        pessoa.setIdade(10);
        pessoa.envelhecer();
        assertEquals(11, pessoa.getIdade());
    }

    @Test
    public void deveCrescer() {
        pessoa.setIdade(20);
        pessoa.setAltura(1.59f);
        pessoa.crescer(0.01f);
        assertEquals(1.60f, pessoa.getAltura());
    }

    @Test
    public void deveVerificarCrescimentoZeradoNegativo() {
        try {
            pessoa.crescer(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura adicionada invalida", e.getMessage());
        }
    }

    @Test
    public void naoDeveCrescer() {
        pessoa.setIdade(21);
        pessoa.setAltura(1.59f);
        pessoa.crescer(0.01f);
        assertEquals(1.59f, pessoa.getAltura());
    }

    @Test
    public void deveGanharPeso() {
        pessoa.setPeso(60);
        pessoa.ganhar_peso(3);
        assertEquals(63, pessoa.getPeso());
    }

    @Test
    public void deveVerificarGanhoPesoZeradoNegativo() {
        try {
            pessoa.ganhar_peso(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso adicionado invalido", e.getMessage());
        }
    }

    @Test
    public void devePerderPeso() {
        pessoa.setPeso(60);
        pessoa.perder_peso(3);
        assertEquals(57, pessoa.getPeso());
    }

    @Test
    public void deveVerificarPercaPesoZeradoNegativo() {
        try {
            pessoa.perder_peso(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso adicionado invalido", e.getMessage());
        }
    }

}