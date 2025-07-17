/*Atributos: nome, cargo, salario, departamento
Métodos: receber_aumento, mudar_departamento, exibir_dados
• receber_aumento(percentual): Aplica um aumento de percentual ao salario.
• mudar_departamento(novo_departamento): Altera o departamento para o novo_departamento.
• exibir_dados(): Exibe os dados do funcionário, incluindo nome, cargo, salário e departamento.*/

package lista002;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receber_aumento(float percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Aumento invalido");
        }
        this.salario += this.salario * (percentual/100);
    }

    public void mudar_departamento(String novo_departamento) {
        setDepartamento(novo_departamento);
    }

    public void exibir_dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.printf("Salario: R$ %.2f\n", this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
