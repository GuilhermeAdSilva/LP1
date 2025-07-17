package lista003.SistemaPagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularPagamento() {
        FuncionarioComum funcionarioComum = new FuncionarioComum(10);
        assertEquals(10, funcionarioComum.calcularPagamento());
    }

}