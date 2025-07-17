package lista003.FormaGeometrica;

public class Circulo extends FormaGeometrica {
    private float raio;
    private final float pi = (float) Math.PI;

    public Circulo(float raio) {
        setRaio(raio);
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        if (raio <= 0){
            throw new IllegalArgumentException("Raio invalido");
        }
        this.raio = raio;
    }

    public float getPi() {
        return this.pi;
    }

    public float calcularArea() {
        return (pi * (raio * raio));
    }
    public float calcularPerimetro() {
        return (2 * pi * raio);
    }
}
