package lista003.SistemaContasBancarias;

public class ContaCorrente extends ContaBancaria{
    private float taxa;

    public ContaCorrente() {
        this.taxa = 0;
    }

    public float getTaxa() {
        return this.taxa;
    }

    public void setTaxa(float taxa) {
        if (taxa <= 0) {
            throw new IllegalArgumentException("Taxa invalida");
        }
        this.taxa = taxa;
    }

    public void depositar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposito invalido");
        }
        setSaldo(this.getSaldo() + valor);
        setSaldo(this.getSaldo() - (this.getSaldo() * (this.taxa/100)));
    }
    public void sacar(float valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Saque invalido");
        }
        setSaldo(this.getSaldo() - valor);
    }
}
