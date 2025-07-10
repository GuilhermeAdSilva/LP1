package lista004AssociacaoN.ex08SistemaControleAcademico;

public class AlunoMensalista extends Aluno {
    private float valorMensalidade;
    private float quantidadeParcelas;

    public AlunoMensalista(Curso curso) {
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
}

