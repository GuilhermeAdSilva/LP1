package lista004AssociacaoN.ex06SistemaControleEstacionamento;

public abstract class Vaga {
    private int numero;
    private String placaVeiculo;
    //tipo de aluguel
    private Cliente cliente;

    public Vaga() {
        this.numero = 0;
        this.placaVeiculo = "";
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract float calcularAluguel();
}
