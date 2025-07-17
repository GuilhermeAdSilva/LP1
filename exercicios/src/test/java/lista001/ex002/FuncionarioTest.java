package lista001.ex002;

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
    public void deveCalcularHorasExtras() {
        funcionario.setValorHorasExtras(10.0f);
        funcionario.setQuantidadeHorasExtras(5.0f);
        assertEquals(50.0f, funcionario.calcularHorasExtras());
    }

    @Test
    public void deveCalcularSalarioLiquido() {
        funcionario.setSalarioBruto(1000.0f);
        funcionario.setValorHorasExtras(10.0f);
        funcionario.setQuantidadeHorasExtras(5.0f);
        assertEquals(966.0f, funcionario.calcularSalarioLiquido());
    }

    @Test
    public void deveVerificarSalarioZerado() {
        try {
            funcionario.setSalarioBruto(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarValorHorasExtrasZerado() {
        try {
            funcionario.setValorHorasExtras(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor de horas extras invalido!", e.getMessage());
        }
    }

    @Test
    public void deveVerificarQuantidadeHorasExtrasNegativa() {
        try {
            funcionario.setQuantidadeHorasExtras(-0.1f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida de horas extras!", e.getMessage());
        }
    }

}