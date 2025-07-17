package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
        assertEquals(1, cliente.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Cliente cliente = new Cliente();
        try {
            cliente.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarNomeNaoVazio() {
        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        assertEquals("Guilherme", cliente.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio() {
        Cliente cliente = new Cliente();
        try {
            cliente.setNome(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarZeroManutencoes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarUmaManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        cliente.alocarManutencao(manutencao);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarMaisDeUmaManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        ManutencaoCPU manutencao2 = new ManutencaoCPU(cliente);
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        assertEquals(2, cliente.numeroManutencoes());
    }

    @Test
    void naoDeveRetornarMesmoObjeto() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRemoverUmaManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        ManutencaoCPU manutencao2 = new ManutencaoCPU(cliente);
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.removerManutencao(manutencao);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarListaValorManutencaoCLiente() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        manutencao.setValorPecasTrocadas(10);
        manutencao.setValorMaoDeObra(5);
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora(cliente);
        manutencao2.setValorPecasTrocadas(16);
        manutencao2.setValorMaoDeObra(4);
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor(cliente);
        manutencao3.setValorMaoDeObra(40);

        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        ArrayList<Float> esperado = new ArrayList<Float>();
        esperado.add(15f);
        esperado.add(20f);
        esperado.add(40f);
        assertEquals(esperado, cliente.listaValoresManutencaoCliente());
    }

    @Test
    void deveRetornarListaManutencaoCLiente() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora(cliente);
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor(cliente);

        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Manutenção de CPU");
        esperado.add("Manutenção de Impressora");
        esperado.add("Manutenção de Monitor");
        assertEquals(esperado, cliente.listaManutencaoCliente());
    }

}