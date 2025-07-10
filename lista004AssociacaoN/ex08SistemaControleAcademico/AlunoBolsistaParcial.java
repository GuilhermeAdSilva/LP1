package lista004AssociacaoN.ex08SistemaControleAcademico;

public class AlunoBolsistaParcial extends Aluno {
    private float valorMensalidade;
    private float quantidadeParcelas;
    private float percentualDesconto;

    public AlunoBolsistaParcial(Curso curso) {
        super(curso);
        this.valorMensalidade = 0;
        this.quantidadeParcelas = 0;
    }

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public float getQuantidadeParcelas() {
        return this.quantidadeParcelas;
    }

    public void setQuantidadeParcelas(float quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        if (percentualDesconto > 50) {
            throw new IllegalArgumentException("O desconto nao pode ser superior a 50%");
        } else {
            this.percentualDesconto = percentualDesconto;
        }
    }
}
