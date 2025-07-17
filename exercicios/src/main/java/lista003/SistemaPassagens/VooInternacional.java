package lista003.SistemaPassagens;

public class VooInternacional extends Voo{

    private float taxaConversao;

    public VooInternacional(String origem, float distancia, String destino, String data, float fatorEspecifico, float taxaConversao) {
        super(origem, distancia, destino, data, fatorEspecifico);
        setTaxaConversao(taxaConversao);
    }

    public float getTaxaConversao() {
        return this.taxaConversao;
    }

    public void setTaxaConversao(float taxaConversao) {
        if (taxaConversao <= 0) {
            throw new IllegalArgumentException("Taxa de conversao invalida");
        }
        this.taxaConversao = taxaConversao;
    }

    public float calcularPreco() {
        return ((this.getFatorEspecifico() * this.getDistancia()) + this.taxaConversao);
    }

}
