package lista003.SistemaContasBancarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void deveCalcularSaldoJuros() {
        ContaBancaria conta = new ContaPoupanca();
        conta.setSaldo(100);
        conta.calcularJuros();
        assertEquals(110, conta.getSaldo());
    }
}