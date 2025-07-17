package lista003.SistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveVerificarSalarioValido() {
        Funcionario funcionario = new FuncionarioComum(0.01f);
        assertEquals(0.01f, funcionario.getSalarioMensal());
    }

    @Test
    void deveVerificarSalarioZeradoNegativo() {
        try {
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

}