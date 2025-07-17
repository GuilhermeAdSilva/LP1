package lista003.SistemaContasBancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveCalcularDeposito() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(100);
        assertEquals(100, conta.getSaldo());
    }

    @Test
    void deveVerificarDepositoZeradoNegativo() {
        try {
            ContaPoupanca conta = new ContaPoupanca();
            conta.depositar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Deposito invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularSaque() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.setSaldo(100);
        conta.sacar(100);
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void deveVerificarSaqueZeradoNegativo() {
        try {
            ContaPoupanca conta = new ContaPoupanca();
            conta.sacar(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saque invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarSaqueInsuficiente() {
        try {
            ContaPoupanca conta = new ContaPoupanca();
            conta.setSaldo(0);
            conta.sacar(1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor insuficiente para saque", e.getMessage());
        }
    }

}