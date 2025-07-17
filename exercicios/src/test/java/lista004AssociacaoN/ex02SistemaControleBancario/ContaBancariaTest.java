package lista004AssociacaoN.ex02SistemaControleBancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    @Test
    void deveAceitarNumeroContaMaiorQueZero() {Cliente cliente = new Cliente();
        ContaBancaria contaBancaria = new ContaCorrenteEspecial(cliente);
        contaBancaria.setNumeroConta(1);
        assertEquals(1, contaBancaria.getNumeroConta());
    }

    @Test
    void deveLancarExcecaoNumeroContaZeradoNegativo() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria contaBancaria = new ContaCorrenteEspecial(cliente);
            contaBancaria.setNumeroConta(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Conta invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarSaldoContaNaoNegativo() {
        Cliente cliente = new Cliente();
        ContaBancaria contaBancaria = new ContaCorrenteEspecial(cliente);
        contaBancaria.setSaldo(0);
        assertEquals(0, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSaldoContaNegativo() {
        try {
            Cliente cliente = new Cliente();
            ContaBancaria contaBancaria = new ContaCorrenteEspecial(cliente);
            contaBancaria.setSaldo(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Saldo invalido", e.getMessage());
        }
    }

}