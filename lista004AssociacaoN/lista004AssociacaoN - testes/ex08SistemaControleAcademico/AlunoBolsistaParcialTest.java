package lista004AssociacaoN.ex08SistemaControleAcademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {
    @Test
    void deveLancarExcecaoDescontoMaiorCinquentaPorcento() {
        Curso curso = new Curso();
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial(curso);
        try {
            aluno.setPercentualDesconto(50.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("O desconto nao pode ser superior a 50%", e.getMessage());
        }
    }

}