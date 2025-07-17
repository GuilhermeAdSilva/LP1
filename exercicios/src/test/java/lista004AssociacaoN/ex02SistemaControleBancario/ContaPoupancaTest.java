package lista004AssociacaoN.ex02SistemaControleBancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {
    @Test
    void deveRetornarTipoConta() {
        Cliente cliente = new Cliente();
        ContaPoupanca conta = new ContaPoupanca(cliente);
        assertEquals("Conta Poupança", conta.getTipoConta());
    }
}