/*Atributos: titular, numero_conta, saldo
Métodos: depositar, sacar
• depositar(valor): adiciona o valor ao saldo da conta.
• sacar(valor): subtrai o valor do saldo da conta,
se houver saldo suficiente.*/

package lista002;

public class ContaBancaria {
    private String titular;
    private int numero_conta;
    private float saldo;

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero_conta() {
        return this.numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0.0f) {
            throw new IllegalArgumentException("Saldo invalido!");
        }
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= valor;
    }
}
