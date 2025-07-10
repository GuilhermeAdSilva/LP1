package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaCorrenteEspecial extends ContaBancaria{
    private float limiteCredito;

    public ContaCorrenteEspecial() {
        super();
        this.limiteCredito = 0;
    }

    public float getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public float cacularSaldoDisponivel() {
        return (this.getSaldo() + this.limiteCredito);
    }
}
