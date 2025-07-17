package lista004AssociacaoN.ex04SistemaControleTransportadora;

public class FreteNormal extends Frete {

    public FreteNormal(Cliente cliente) {
        super(cliente);
    }
    public float calcularFrete() {
        return this.getValorFrete();
    }

    public String getTipoFrete() {
        return "Frete Normal";
    }
}
