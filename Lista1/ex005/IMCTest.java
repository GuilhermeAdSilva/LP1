package org.ex005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IMCTest {

    IMC pessoa;

    @BeforeEach
    public void getUp() {
        pessoa = new IMC();
    }

    @Test
    public void deveCalcularIMC() {
        pessoa.setPeso(45);
        pessoa.setAltura(1.5f);
        pessoa.setSexo('M');
        assertEquals(20, pessoa.calcularIMC());
    }

    @Test
    public void deveRetornarResultadoIMC() {
        pessoa.setPeso(45);
        pessoa.setAltura(1.5f);
        pessoa.setSexo('M');
        assertEquals("Abaixo do peso", pessoa.informarIMC(pessoa.calcularIMC()));
    }

}