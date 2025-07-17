package lista003.SistemaPagamento;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(float salario) {
        super(salario);
    }
    public float calcularPagamento() {
        return this.salarioMensal;
    }
}
