package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca() {
        super();
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }
}
