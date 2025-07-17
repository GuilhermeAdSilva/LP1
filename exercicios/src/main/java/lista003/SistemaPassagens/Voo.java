package lista003.SistemaPassagens;


import java.time.LocalDate;

public abstract class Voo {
    private String origem;
    private float distancia;
    private String destino;
    private String data;
    private float fatorEspecifico;

    public Voo(String origem, float distancia, String destino, String data, float fatorEspecifico) {
        setOrigem(origem);
        setDistancia(distancia);
        setDestino(destino);
        setData(data);
        setFatorEspecifico(fatorEspecifico);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        origem = origem.trim();
        if (origem.isEmpty()) {
            throw new IllegalArgumentException("Origem invalida");
        }
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        if (distancia <= 0) {
            throw new IllegalArgumentException("Distancia invalida");
        }
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        destino = destino.trim();
        if (destino.isEmpty()) {
            throw new IllegalArgumentException("Destino invalido");
        }
        this.destino = destino;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        data = data.trim();
        if (data.isEmpty()) {
            throw new IllegalArgumentException("Data invalida");
        }
        this.data = data;
    }

    public float getFatorEspecifico() {
        return this.fatorEspecifico;
    }

    public void setFatorEspecifico(float fatorEspecifico) {
        if (fatorEspecifico <= 0) {
            throw new IllegalArgumentException("Fator de voo invalido");
        }
        this.fatorEspecifico = fatorEspecifico;
    }

    public abstract float calcularPreco();
}
