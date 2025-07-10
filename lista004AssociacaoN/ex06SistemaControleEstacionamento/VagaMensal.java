package lista004AssociacaoN.ex06SistemaControleEstacionamento;

public class VagaMensal extends Vaga {
    private int quantidadeMeses;

    public VagaMensal() {
        super();
        this.quantidadeMeses = 0;
    }

    public int getQuantidadeMeses() {
        return this.quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    public float calcularAluguel(){
        return (this.quantidadeMeses * 150);
    }
}
