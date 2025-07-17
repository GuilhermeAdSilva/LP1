package lista001.ex005;

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
    public void deveCalcularImc() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.65f);
        pessoa.setPeso(70.0f);
        assertEquals(25.71f, pessoa.calcularIMC(), 0.01f);
    }

    @Test
    public void deveTestarMinusculaSexoM() {
        pessoa.setSexo('m');
        assertEquals('M', pessoa.getSexo());
    }

    @Test
    public void deveTestarMinusculaSexoF() {
        pessoa.setSexo('f');
        assertEquals('F', pessoa.getSexo());
    }

    @Test
    public void deveVerificarSexoInvalido() {
        try {
            pessoa.setSexo('x');
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Sexo invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarAlturaZerada() {
        try {
            pessoa.setAltura(0.0f);
        } catch (IllegalArgumentException e) {
            assertEquals("Altura invalida!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarPesoZerado() {
        try {
            pessoa.setPeso(0.0f);
        } catch (IllegalArgumentException e) {
            assertEquals("Peso invalido!", e.getMessage());
        }
    }

    @Test
    public void deveCalcualarImcAbaixoPesoMulher() {
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        assertEquals("Abaixo do peso", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcPesoNormalMulher() {
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        assertEquals("No peso normal", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcMarginalmenteAcimaPesoMulher() {
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        assertEquals("Marginalmente acima do peso", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcAcimaPesoIdealMulher() {
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        assertEquals("Acima do peso ideal", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcObesoMulher() {
        pessoa.setSexo('F');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.3f);
        assertEquals("Obeso", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcAbaixoPesoHomem() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        assertEquals("Abaixo do peso", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcPesoNormalHomem() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        assertEquals("No peso normal", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcMarginalmenteAcimaPesoHomem() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        assertEquals("Marginalmente acima do peso", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcAcimaPesoIdealHomem() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        assertEquals("Acima do peso ideal", pessoa.informarImc(pessoa.calcularIMC()));
    }

    @Test
    public void deveCalcualarImcObesoHomem() {
        pessoa.setSexo('M');
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.1f);
        assertEquals("Obeso", pessoa.informarImc(pessoa.calcularIMC()));
    }
}