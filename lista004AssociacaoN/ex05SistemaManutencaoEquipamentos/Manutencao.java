package lista004AssociacaoN.ex05SistemaManutencaoEquipamentos;

public abstract class Manutencao {
    private Cliente cliente;
    private int numeroManutencao;
    protected float valorMaoDeObra;
    //tipo


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroManutencao() {
        return this.numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao) {
        this.numeroManutencao = numeroManutencao;
    }

    public float getValorMaoDeObra() {
        return this.valorMaoDeObra;
    }

    public void setValorMaoDeObra(float valorMaoDeObra) {
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public abstract float calcularValorManutencao();


}
