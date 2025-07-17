package lista003.SistemaContasBancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveCalcularDeposito() {
        ContaCorrente conta = new ContaCorrente();
        conta.setTaxa(5);
        conta.depositar(100);
        assertEquals(95, conta.getSaldo());
    }

    @Test
    void deveVerificarDepositoZeradoNegativo() {
        try {
            ContaCorrente conta = new ContaCorrente();
            conta.setTaxa(5);
            conta.depositar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Deposito invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTaxaZeradaNegativa() {
        try {
            ContaCorrente conta = new ContaCorrente();
            conta.setTaxa(0);
            conta.depositar(100);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaque() {
        ContaCorrente conta = new ContaCorrente();
        conta.sacar(100);
        assertEquals(-100, conta.getSaldo());
    }

    @Test
    void deveVerificarSaqueZeradoNegativo() {
        try {
            ContaCorrente conta = new ContaCorrente();
            conta.sacar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saque invalido", e.getMessage());
        }
    }

}