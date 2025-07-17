package lista004AssociacaoN.ex02SistemaControleBancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteNormalTest {
    @Test
    void deveRetornarTipoConta() {
        Cliente cliente = new Cliente();
        ContaCorrenteNormal conta = new ContaCorrenteNormal(cliente);
        assertEquals("Conta Corrente Normal", conta.getTipoConta());
    }
}