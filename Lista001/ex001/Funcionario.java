/*Calcular o aumento que será dado a um funcionário,
a partir do salário atual e a porcentagem de aumento.
Apresentar o novo valor do salário e o valor do aumento.*/

package lista001.ex001;

public class Funcionario {
    private float salarioAtual;
    private float porcentagemAumento;

    public float getSalarioAtual() {
        return this.salarioAtual;
    }
    public void setSalarioAtual(float salarioAtual) {
        if (salarioAtual <= 0) {
            throw new IllegalArgumentException("Salario invalido!");
        }
        this.salarioAtual = salarioAtual;
    }

    public float getPorcentagemAumento() {
        return this.porcentagemAumento;
    }
    public void setPorcentagemAumento(float porcentagemAumento) {
        if (porcentagemAumento < 0) {
            throw new IllegalArgumentException("Aumento invalido!");
        }
        this.porcentagemAumento = porcentagemAumento;
    }

    public float calcularAumentoSalario() {
        return this.salarioAtual * (this.porcentagemAumento/100);
    }

    public float calcularNovoSalario() {
        return this.salarioAtual + calcularAumentoSalario();
    }
}
