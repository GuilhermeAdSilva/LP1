package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaCorrenteNormal extends ContaBancaria {

    public ContaCorrenteNormal(Cliente cliente) {
        super(cliente);
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }

    public String getTipoConta() {
        return "Conta Corrente Normal";
    }
}
