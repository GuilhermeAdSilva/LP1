/*Calcular o salário líquido do funcionário sabendo que este é
constituído pelo salário bruto mais o valor das horas extras
subtraindo 8% de INSS do total. Serão informados nesse problema
o salário bruto, o valor das horas extras e o número de horas extras.
Apresentar ao final o salário líquido.*/

package lista001.ex002;

public class Funcionario {
    private float salarioBruto;
    private float valorHorasExtras;
    private float quantidadeHorasExtras;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto <= 0) {
            throw new IllegalArgumentException("Salario invalido!");
        }
        this.salarioBruto = salarioBruto;
    }

    public float getValorHorasExtras() {
        return this.valorHorasExtras;
    }

    public void setValorHorasExtras(float valorHorasExtras) {
        if (valorHorasExtras <= 0) {
            throw new IllegalArgumentException("Valor de horas extras invalido!");
        }
        this.valorHorasExtras = valorHorasExtras;
    }

    public float getQuantidadeHorasExtras() {
        return this.quantidadeHorasExtras;
    }

    public void setQuantidadeHorasExtras(float quantidadeHorasExtras) {
        if (quantidadeHorasExtras < 0) {
            throw new IllegalArgumentException("Quantidade invalida de horas extras!");
        }
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }

    public float calcularHorasExtras() {
        return this.quantidadeHorasExtras * this.valorHorasExtras;
    }

    public float calcularSalarioLiquido() {
        return (this.salarioBruto + calcularHorasExtras()) * 0.92f;
    }
}
