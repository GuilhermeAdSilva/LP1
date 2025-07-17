package lista004AssociacaoN.ex01SistemaArrecadaçãoIPTU;

public class Lote extends Imovel{
    private float metragemQuadradaTerreno;

    public Lote() {
        this.metragemQuadradaTerreno = 0;
    }

    public float getMetragemQuadradaTerreno() {
        return this.metragemQuadradaTerreno;
    }

    public void setMetragemQuadradaTerreno(float metragemQuadradaTerreno) {
        if (metragemQuadradaTerreno <= 0) {
            throw new IllegalArgumentException("Metragem invalida");
        } else {
            this.metragemQuadradaTerreno = metragemQuadradaTerreno;
        }
    }

    public float calcularValorImovel(){
        return (this.metragemQuadradaTerreno * 30);
    }

    public String getTipoImovel() {
        return "Lote";
    }
}
