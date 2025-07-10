package lista004AssociacaoN.ex04SistemaControleTransportadora;

public class FreteEspecial extends Frete{
    private float taxaEntrega;

    public FreteEspecial() {
        super();
        this.taxaEntrega = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public float calcularFrete() {
        return (this.valorFrete + this.taxaEntrega);
    }
}
