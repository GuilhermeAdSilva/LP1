package lista004AssociacaoN.ex07SistemaVideoLocadora;

public class FitaEspecial extends Fita {
    private float valorAluguelDiario;
    public FitaEspecial() {
        super();
        this.valorAluguelDiario = 0;
    }

    public float getValorAluguelDiario() {
        return this.valorAluguelDiario;
    }

    public void setValorAluguelDiario(float valorAluguelDiario) {
        if (valorAluguelDiario <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        } else {
            this.valorAluguelDiario = valorAluguelDiario;
        }
    }

    public float calcularValorEmprestimoFita() {
        return (this.quantidadeDiasEmprestimo * this.valorAluguelDiario);
    }
}
