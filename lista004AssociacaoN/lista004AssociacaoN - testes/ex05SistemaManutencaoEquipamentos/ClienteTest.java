package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarZeroManutencoes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarUmaManutencao() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarMaisDeUmaManutencao() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao);
        assertEquals(2, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarListaValorManutencaoCLiente() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        manutencao.setValorPecasTrocadas(10);
        manutencao.setValorMaoDeObra(5);
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora();
        manutencao2.setValorPecasTrocadas(16);
        manutencao2.setValorMaoDeObra(4);
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();
        manutencao3.setValorMaoDeObra(40);


        Cliente cliente = new Cliente();
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
        ManutencaoCPU manutencao = new ManutencaoCPU();
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora();
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();


        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Manutenção de CPU");
        esperado.add("Manutençãoo de Impressora");
        esperado.add("Manutençãoo de Monitor");
        assertEquals(esperado, cliente.listaManutencaoCliente());
    }

}