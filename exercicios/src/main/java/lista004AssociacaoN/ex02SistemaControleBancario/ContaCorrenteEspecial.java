package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaCorrenteEspecial extends ContaBancaria{
    private float limiteCredito;

    public ContaCorrenteEspecial(Cliente cliente) {
        super(cliente);
        this.limiteCredito = 0;
    }

    public float getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        if (limiteCredito < 0) {
            throw new IllegalArgumentException("Limite invalido");
        } else {
            this.limiteCredito = limiteCredito;
        }
    }

    public float cacularSaldoDisponivel() {
        return (this.getSaldo() + this.limiteCredito);
    }

    public String getTipoConta() {
        return "Conta Corrente Especial";
    }
}
