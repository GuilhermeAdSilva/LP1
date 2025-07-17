package lista003.SistemaPassagens;

public class VooDomestico extends Voo {

    public VooDomestico(String origem, float distancia, String destino, String data, float fatorEspecifico) {
        super(origem, distancia, destino, data, fatorEspecifico);
    }

    public float calcularPreco() {
        return (this.getFatorEspecifico() * this.getDistancia());
    }
}
