package org.ex001;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    SalarioAumento salario;

    @BeforeEach
    public void setUp() {
        salario = new SalarioAumento();
    }

    @Test
    public void deveCalcularNovoSalario() {
        salario.setSalarioAtual(1000);
        salario.setPorcentagemAumento(10);
        assertEquals(1100, salario.calcularNovoSalario());
    }

    @Test
    public void deveCalcularAumento() {
        salario.setSalarioAtual(1000);
        salario.setPorcentagemAumento(10);
        assertEquals(100, salario.calcularAumento());
    }
}