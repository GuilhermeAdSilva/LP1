package lista003.FormaGeometrica;

public class Retangulo extends FormaGeometrica {

    private float altura;
    private float largura;

    public Retangulo(float altura, float largura) {
        setAltura(altura);
        setLargura(largura);
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float largura) {
        if (largura <= 0){
            throw new IllegalArgumentException("Largura invalida");
        }
        this.largura = largura;
    }

    public float calcularArea() {
        return (this.altura * this.largura);
    }
    public float calcularPerimetro() {
        return ((this.altura * 2) + (this.largura * 2));
    }
}
