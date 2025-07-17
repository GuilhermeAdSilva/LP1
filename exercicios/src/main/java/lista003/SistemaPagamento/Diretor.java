package lista003.SistemaPagamento;

public class Diretor extends Funcionario{
    private float participacaoLucros;

    public Diretor(float salarioMensal, float participacaoLucros) {
        super(salarioMensal);
        setParticipacaoLucros(participacaoLucros);
    }

    public float getParticipacaoLucros() {
        return this.participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        if (participacaoLucros <= 0) {
            throw new IllegalArgumentException("Participacao em lucros invalida");
        }
        this.participacaoLucros = participacaoLucros;
    }

    public float calcularPagamento() {
        return (this.participacaoLucros + this.salarioMensal);
    }
}
