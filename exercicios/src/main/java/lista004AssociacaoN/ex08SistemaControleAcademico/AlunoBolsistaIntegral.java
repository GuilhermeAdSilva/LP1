package lista004AssociacaoN.ex08SistemaControleAcademico;

public class AlunoBolsistaIntegral extends Aluno {
    private int quantidadeParcelasIsentas;
    public AlunoBolsistaIntegral(Curso curso) {
        super(curso);
        this.quantidadeParcelasIsentas = 0;
    }

    public int getQuantidadeParcelasIsentas() {
        return this.quantidadeParcelasIsentas;
    }

    public void setQuantidadeParcelasIsentas(int quantidadeParcelasIsentas) {
        if (quantidadeParcelasIsentas < 0) {
            throw new IllegalArgumentException("Numero invalido");
        } else {
            this.quantidadeParcelasIsentas = quantidadeParcelasIsentas;
        }
    }

    public String getInfoAlunoCurso() {
        return ("O aluno " + this.getNome() + ", de matrícula " +
                this.getMatricula() + " e endereço " + this.getEndereco() +
                ", é bolsista integral e não paga mensalidade, tendo " +
                this.getQuantidadeParcelasIsentas() +
                " parcelas isentas.");
    }
}
