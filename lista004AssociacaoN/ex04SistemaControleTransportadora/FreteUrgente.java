package lista004AssociacaoN.ex04SistemaControleTransportadora;

public class FreteUrgente extends Frete{
    private float taxaEntrega;
    private int quantidadeItens;

    public FreteUrgente() {
        super();
        this.taxaEntrega = 0;
        this.quantidadeItens = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float calcularFrete() {
        return (this.valorFrete + this.taxaEntrega + (this.quantidadeItens * 10));
    }
}
