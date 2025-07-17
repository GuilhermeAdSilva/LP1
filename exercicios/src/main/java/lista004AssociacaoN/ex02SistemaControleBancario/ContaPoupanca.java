package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }

    public String getTipoConta() {
        return "Conta Poupança";
    }
}
