/*Calcular o aumento que será dado a um funcionário,
a partir do salário atual e a porcentagem de aumento.
Apresentar o novo valor do salário e o valor do aumento.*/

package org.ex001;

public class SalarioAumento {
    private float salarioAtual;
    private float porcentagemAumento;

    public float getSalarioAtual() {
        return this.salarioAtual;
    }
    public void setSalarioAtual(float salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public float getPorcentagemAumento() {
        return this.porcentagemAumento;
    }
    public void setPorcentagemAumento(float porcentagemAumento) {
        this.porcentagemAumento = porcentagemAumento;
    }

    public float calcularNovoSalario() {
        return this.salarioAtual + (this.salarioAtual * (porcentagemAumento/100));
    }

    public float calcularAumento() {
        return calcularNovoSalario() - salarioAtual;
    }
}
