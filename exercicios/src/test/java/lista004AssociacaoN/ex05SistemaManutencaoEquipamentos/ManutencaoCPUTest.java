package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoCPUTest {
    @Test
    void deveAceitarValorMaiorQueZeroPecasTrocadas() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        manutencao.setValorPecasTrocadas(0.01f);
        assertEquals(0.01f, manutencao.getValorPecasTrocadas());
    }

    @Test
    void develancarExcecaoValorMaiorZeradoNegativoPecasTrocadas() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        try {
            manutencao.setValorPecasTrocadas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoEquipamentoManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao = new ManutencaoCPU(cliente);
        assertEquals("Manutenção de CPU", manutencao.getTipoEquipamentoManutencao());
    }

}