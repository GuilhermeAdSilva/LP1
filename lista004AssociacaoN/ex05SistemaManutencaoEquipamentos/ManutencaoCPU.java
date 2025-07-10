package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

public class ManutencaoCPU extends Manutencao {
    private float valorPecasTrocadas;

    public float getValorPecasTrocadas() {
        return this.valorPecasTrocadas;
    }

    public void setValorPecasTrocadas(float valorPecasTrocadas) {
        this.valorPecasTrocadas = valorPecasTrocadas;
    }

    public float calcularValorManutencao() {
        return (this.valorPecasTrocadas + this.valorMaoDeObra);
    }
}
