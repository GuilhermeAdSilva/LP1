package lista004AssociacaoN.ex06SistemaControleEstacionamento;

public class VagaDiaria extends Vaga {
    private int quantidadeDias;

    VagaDiaria() {
        super();
        this.quantidadeDias = 0;
    }

    public int getQuantidadeDias() {
        return this.quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public float calcularAluguel(){
        return (this.quantidadeDias * 10);
    }
}
