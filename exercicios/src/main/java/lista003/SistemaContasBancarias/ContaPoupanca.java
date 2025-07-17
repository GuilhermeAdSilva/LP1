package lista003.SistemaContasBancarias;

public class ContaPoupanca extends ContaBancaria {

    public void depositar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito invalido");
        }
        setSaldo(this.getSaldo() + valor);
    }
    public void sacar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Saque invalido");
        }
        if (this.getSaldo() < valor) {
            throw new IllegalArgumentException("Valor insuficiente para saque");
        }
        this.setSaldo(this.getSaldo() - valor);
    }
}
