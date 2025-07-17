package lista004AssociacaoN.ex02SistemaControleBancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteEspecialTest {
    @Test
    void deveAceitarLimiteCreditoMaiorIgualZero() {
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(cliente);
        contaCorrenteEspecial.setLimiteCredito(0);
        assertEquals(0, contaCorrenteEspecial.getLimiteCredito());
    }

    @Test
    void deveLancarExcecaoLimiteCreditoNegativo() {
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(cliente);
        try {
            contaCorrenteEspecial.setLimiteCredito(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Limite invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoConta() {
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(cliente);
        assertEquals("Conta Corrente Especial", contaCorrenteEspecial.getTipoConta());
    }

}