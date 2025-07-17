package lista004AssociacaoN.ex04SistemaControleTransportadora;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        lista004AssociacaoN.ex02SistemaControleBancario.Cliente cliente = new lista004AssociacaoN.ex02SistemaControleBancario.Cliente();
        cliente.setCodigo(1);
        assertEquals(1, cliente.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        lista004AssociacaoN.ex02SistemaControleBancario.Cliente cliente = new lista004AssociacaoN.ex02SistemaControleBancario.Cliente();
        try {
            cliente.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        lista004AssociacaoN.ex02SistemaControleBancario.Cliente cliente = new lista004AssociacaoN.ex02SistemaControleBancario.Cliente();
        cliente.setNome("Guilherme");
        assertEquals("Guilherme", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        lista004AssociacaoN.ex02SistemaControleBancario.Cliente cliente = new lista004AssociacaoN.ex02SistemaControleBancario.Cliente();
        try {
            cliente.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarZeroFretes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente);
        cliente.alocarFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarMaisDeUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente);
        FreteNormal frete2 = new FreteNormal(cliente);
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete2);
        assertEquals(2, cliente.calcularQuantidadeFretes());
    }

    @Test
    void naoDeveAlocarMesmoObjeto() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente);
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRemoverUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete = new FreteNormal(cliente);
        FreteNormal frete2 = new FreteNormal(cliente);
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete2);
        cliente.removerFrete(frete);
        assertEquals(1, cliente.calcularQuantidadeFretes());
    }

    @Test
    void deveRetornarListaFretesCliente() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(cliente);
        FreteEspecial frete2 = new FreteEspecial(cliente);
        FreteUrgente frete3 = new FreteUrgente(cliente);

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Frete Normal");
        resultadoEsperado.add("Frete Especial");
        resultadoEsperado.add("Frete Urgente");

        assertEquals(resultadoEsperado, cliente.verificarFretesCliente());
    }

    @Test
    void deveRetornarListaValoresFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal(cliente);
        frete1.setValorFrete(10);
        FreteEspecial frete2 = new FreteEspecial(cliente);
        frete2.setValorFrete(10);
        frete2.setTaxaEntrega(5);
        FreteUrgente frete3 = new FreteUrgente(cliente);
        frete3.setValorFrete(10);
        frete3.setTaxaEntrega(5);
        frete3.setQuantidadeItens(2);

        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<Float> resultadoEsperado = new ArrayList<Float>();
        resultadoEsperado.add(10f);
        resultadoEsperado.add(15f);
        resultadoEsperado.add(35f);

        assertEquals(resultadoEsperado, cliente.verificarValoresFrete());
    }
}