package org.ex002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalarioLiquidoTest {

    SalarioLiquido salario;

    @BeforeEach
    public void getUp() {
        salario = new SalarioLiquido();
    }

    @Test
    public void deveCalcularSalarioLiquido() {
        salario.setSalarioBruto(1000);
        salario.setValorHorasExtras(20);
        salario.setQuantidadeHorasExtras(5);
        assertEquals(1012, salario.calcularSalarioLiquido());
    }
}