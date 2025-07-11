package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

public class ManutencaoMonitor extends Manutencao {

    public ManutencaoMonitor() {
        super();
    }
    public float calcularValorManutencao() {
        return this.getValorMaoDeObra();
    }
}
