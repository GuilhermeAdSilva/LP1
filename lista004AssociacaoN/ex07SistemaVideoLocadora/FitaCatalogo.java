package lista004AssociacaoN.ex07SistemaVideoLocadora;

public class FitaCatalogo extends Fita {
    public FitaCatalogo() {
        super();
    }

    public float calcularValorEmprestimoFita() {
        return (this.getQuantidadeDiasEmprestimo() * 5);
    }
}
