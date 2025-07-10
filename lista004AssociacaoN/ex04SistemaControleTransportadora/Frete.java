package lista004AssociacaoN.ex04SistemaControleTransportadora;

public abstract class Frete {
    protected int numero;
    protected Cliente cliente;
    protected float valorFrete;

    public Frete() {
        this.numero = 0;
        this.valorFrete = 0;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public abstract float calcularFrete();
}
