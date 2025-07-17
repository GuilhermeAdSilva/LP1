package lista002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    ContaBancaria conta;
    @BeforeEach
    public void setUp() {
        conta = new ContaBancaria();
    }

    @Test
    public void deveVerificarSaldoNegativo() {
        try {
            conta.setSaldo(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo invalido!", e.getMessage());
        }
    }

    @Test
    public void deveDepositarValorConta() {
        conta.setSaldo(100.0f);
        conta.depositar(50.25f);
        assertEquals(150.25f, conta.getSaldo());
    }

    @Test
    public void deveSacarValorConta() {
        conta.setSaldo(100.0f);
        conta.sacar(100.0f);
        assertEquals(0.0f, conta.getSaldo());
    }

    @Test
    public void deveVerificarSaqueInvalido() {
        try {
            conta.setSaldo(10.0f);
            conta.sacar(10.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo insuficiente!", e.getMessage());
        }
    }

}