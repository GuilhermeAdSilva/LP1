package lista004AssociacaoN.ex07SistemaVideoLocadora;

public class FitaLancamento extends Fita {
    private float valorAluguelDiario;
    public FitaLancamento() {
        super();
        this.valorAluguelDiario = 0;
    }

    public float getValorAluguelDiario() {
        return this.valorAluguelDiario;
    }

    public void setValorAluguelDiario(float valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public float calcularValorEmprestimoFita() {
        return (this.quantidadeDiasEmprestimo * this.valorAluguelDiario);
    }
}
