package lista004AssociacaoN.ex02SistemaControleBancario;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarZeroContas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroDeContas());
    }

    @Test
    void deveRetornarUmaConta() {
        Cliente cliente = new Cliente();
        ContaCorrenteNormal conta1 = new ContaCorrenteNormal();
        cliente.alocarConta(conta1);
        assertEquals(1, cliente.numeroDeContas());
    }

    @Test
    void deveRetornarMaisDeUmaConta() {
        Cliente cliente = new Cliente();
        ContaCorrenteEspecial conta1 = new ContaCorrenteEspecial();
        cliente.alocarConta(conta1);
        ContaPoupanca conta2 = new ContaPoupanca();
        cliente.alocarConta(conta2);
        assertEquals(2, cliente.numeroDeContas());
    }

    @Test
    void deveRetornarListaQuantidadeContas() {
        Cliente cliente = new Cliente();

        ContaCorrenteNormal conta1 = new ContaCorrenteNormal();
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();
        ContaPoupanca conta3 = new ContaPoupanca();

        cliente.alocarConta(conta1);
        cliente.alocarConta(conta2);
        cliente.alocarConta(conta3);
        cliente.alocarConta(conta1);
        cliente.alocarConta(conta1);
        cliente.alocarConta(conta3);

        String resposta = "Contas Corrente Normal: 3, Contas Corrente Especial: 1, Contas Poupança: 2";
        assertEquals(resposta, cliente.contasPorCliente());
    }

    @Test
    void deveRetornarListaSaldos() {
        ContaCorrenteNormal conta1 = new ContaCorrenteNormal();
        conta1.setSaldo(100f);
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();
        conta2.setSaldo(10f);
        conta2.setLimiteCredito(5f);
        ContaPoupanca conta3 = new ContaPoupanca();
        conta3.setSaldo(600f);

        Cliente cliente = new Cliente();
        cliente.alocarConta(conta1);
        cliente.alocarConta(conta2);
        cliente.alocarConta(conta3);

        ArrayList<Float> resultado = new ArrayList<Float>();
        resultado.add(conta1.cacularSaldoDisponivel());
        resultado.add(conta2.cacularSaldoDisponivel());
        resultado.add(conta3.cacularSaldoDisponivel());

        assertEquals(resultado, cliente.listaSaldos());
    }

}