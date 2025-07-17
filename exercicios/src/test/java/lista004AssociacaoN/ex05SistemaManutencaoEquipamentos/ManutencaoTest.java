package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {
    @Test
    void deveAceitarNumeroManutencaoMaiorZero() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoCPU(cliente);
        manutencao.setNumeroManutencao(1);
        assertEquals(1, manutencao.getNumeroManutencao());
    }

    @Test
    void deveLancarExcecaoNumeroManutencaoZeradoNegativo() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoCPU(cliente);
        try {
            manutencao.setNumeroManutencao(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de manutenção invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarValorMaoObraMaiorZero() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoCPU(cliente);
        manutencao.setValorMaoDeObra(1);
        assertEquals(1, manutencao.getValorMaoDeObra());
    }

    @Test
    void deveLancarExcecaoValorMaoObraZeradoNegativo() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoCPU(cliente);
        try {
            manutencao.setValorMaoDeObra(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTipoEquipamentoCPU() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoCPU(cliente);
        manutencao.setTipoEquipamento("CPU");
        assertEquals("CPU", manutencao.getTipoEquipamento());
    }

    @Test
    void deveVerificarTipoEquipamentoImpressora() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoImpressora(cliente);
        manutencao.setTipoEquipamento("Impressora");
        assertEquals("Impressora", manutencao.getTipoEquipamento());
    }

    @Test
    void deveVerificarTipoEquipamentoMonitor() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoMonitor(cliente);
        manutencao.setTipoEquipamento("Monitor");
        assertEquals("Monitor", manutencao.getTipoEquipamento());
    }

    @Test
    void deveLancarExcecaoTipoEquipamentoInvalido() {
        Cliente cliente = new Cliente();
        Manutencao manutencao = new ManutencaoMonitor(cliente);
        try {
            manutencao.setTipoEquipamento("Teclado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de equipamento invalido", e.getMessage());
        }
    }

}