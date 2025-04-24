/*Calcular o salário líquido do funcionário sabendo que este é
constituído pelo salário bruto mais o valor das horas extras
subtraindo 8% de INSS do total. Serão informados nesse problema
o salário bruto, o valor das horas extras e o número de horas extras.
Apresentar ao final o salário líquido.*/

package org.ex002;

public class SalarioLiquido {
    private float salarioBruto;
    private float valorHorasExtras;
    private float quantidadeHorasExtras;

    public float getSalarioBruto() {
        return salarioBruto;
    }
    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public float getValorHorasExtras() {
        return valorHorasExtras;
    }
    public void setValorHorasExtras(float valorHorasExtras) {
        this.valorHorasExtras = valorHorasExtras;
    }

    public float getQuantidadeHorasExtras() {
        return quantidadeHorasExtras;
    }
    public void setQuantidadeHorasExtras(float quantidadeHorasExtras) {
        this.quantidadeHorasExtras = quantidadeHorasExtras;
    }

    public float calcularSalarioLiquido() {
        return (this.salarioBruto + (this.quantidadeHorasExtras * this.valorHorasExtras)) - (0.08f * (this.salarioBruto + (this.quantidadeHorasExtras * this.valorHorasExtras)));
    }
}
