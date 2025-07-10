package lista004AssociacaoN.ex01SistemaArrecadaçãoIPTU;

public abstract class Imovel {
    Contribuinte contribuinte;

    public Imovel() {
        this.contribuinte = getContribuinte();
    }

    public Contribuinte getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public abstract float getValorImovel();
}
