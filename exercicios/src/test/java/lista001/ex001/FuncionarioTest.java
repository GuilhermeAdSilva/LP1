package lista001.ex001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveCalcularAumentoSalario() {
        funcionario.setSalarioAtual(1000.0f);
        funcionario.setPorcentagemAumento(10.0f);
        assertEquals(100.0f, funcionario.calcularAumentoSalario());
    }

    @Test
    public void deveCalcularNovoSalario() {
        funcionario.setSalarioAtual(1000.0f);
        funcionario.setPorcentagemAumento(10.0f);
        assertEquals(1100.0f, funcionario.calcularNovoSalario());
    }

    @Test
    public void deveVerificarSalarioZerado() {
        try {
            funcionario.setSalarioAtual(0.0f);
            funcionario.setPorcentagemAumento(10.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarAumentoNegativo() {
        try {
            funcionario.setSalarioAtual(1000.0f);
            funcionario.setPorcentagemAumento(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aumento invalido!", e.getMessage());
        }
    }
}