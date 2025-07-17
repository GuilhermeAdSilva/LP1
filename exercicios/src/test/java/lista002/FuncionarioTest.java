package lista002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;
    @BeforeEach
    public void serUp() {
        funcionario = new Funcionario();
    }


    @Test
    public void deveTestarSalarioZerado() {
        try {
            funcionario.setSalario(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    public void deveCalcularSalarioAumento() {
        funcionario.setSalario(1000);
        funcionario.receber_aumento(25);
        assertEquals(1250.0f, funcionario.getSalario());
    }

    @Test
    public void deveTestarAumentoZerado() {
        try {
            funcionario.receber_aumento(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Aumento invalido", e.getMessage());
        }
    }

    @Test
    public void deveMudarDepartamento() {
        funcionario.setDepartamento("Administrativo");
        funcionario.mudar_departamento("Financeiro");
        assertEquals("Financeiro", funcionario.getDepartamento());
    }

    @Test
    public void deveExibirDados() {
        funcionario.setNome("Cristiano Ronaldo");
        funcionario.setCargo("Jogador de futebol");
        funcionario.setSalario(100000000.0f);
        funcionario.setDepartamento("Operacional");
        funcionario.exibir_dados(); //essa eu nao sei testar
    }
}