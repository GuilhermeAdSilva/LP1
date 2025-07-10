package lista004AssociacaoN.ex02SistemaControleBancario;

public class ContaCorrenteNormal extends ContaBancaria {

    public ContaCorrenteNormal() {
        super();
    }

    public float cacularSaldoDisponivel() {
        return this.getSaldo();
    }
}
