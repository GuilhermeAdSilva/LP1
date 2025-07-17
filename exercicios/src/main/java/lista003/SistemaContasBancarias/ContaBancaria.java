package lista003.SistemaContasBancarias;

public abstract class ContaBancaria {
    private float saldo;
    private final float taxaJuros = 10;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getTaxaJuros() {
        return this.taxaJuros;
    }

    public abstract void depositar(float valor);
    public abstract void sacar(float valor);
    public void calcularJuros() {
        setSaldo(getSaldo() + (getSaldo()*(this.taxaJuros/100)));
    }
}
