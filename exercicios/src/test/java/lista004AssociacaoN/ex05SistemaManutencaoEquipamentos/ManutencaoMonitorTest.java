package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoMonitorTest {
    @Test
    void deveRetornarTipoEquipamentoManutencao() {
        Cliente cliente = new Cliente();
        ManutencaoMonitor manutencao = new ManutencaoMonitor(cliente);
        assertEquals("Manutenção de Monitor", manutencao.getTipoEquipamentoManutencao());
    }

}