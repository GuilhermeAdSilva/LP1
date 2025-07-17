package lista003.SistemaPagamento;

public class Gerente extends Funcionario {
    private float bonusFixo;

    public Gerente(float salarioMensal, float bonusFixo) {
        super(salarioMensal);
        setBonusFixo(bonusFixo);
    }

    public float getBonusFixo() {
        return this.bonusFixo;
    }

    public void setBonusFixo(float bonusFixo) {
        if (bonusFixo <= 0) {
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.bonusFixo = bonusFixo;
    }

    public float calcularPagamento() {
        return (this.bonusFixo + this.salarioMensal);
    }
}
