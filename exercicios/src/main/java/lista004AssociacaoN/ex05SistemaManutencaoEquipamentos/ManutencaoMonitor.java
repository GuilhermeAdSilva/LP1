package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

public class ManutencaoMonitor extends Manutencao {

    public ManutencaoMonitor(Cliente cliente) {
        super(cliente);
    }
    public float calcularValorManutencao() {
        return this.getValorMaoDeObra();
    }

    public String getTipoEquipamentoManutencao() {
        return "Manutenção de Monitor";
    }
}
