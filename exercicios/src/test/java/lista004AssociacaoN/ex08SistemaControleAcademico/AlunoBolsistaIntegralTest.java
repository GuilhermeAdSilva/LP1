package lista004AssociacaoN.ex08SistemaControleAcademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {
    Curso curso;
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }

    @Test
    void deveAceitarNumeroParcelarIsentasNaoNegativas() {
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        aluno.setQuantidadeParcelasIsentas(0);
        assertEquals(0, aluno.getQuantidadeParcelasIsentas());
    }

    @Test
    void deveLancarExcecaoNumeroParcelarIsentasNegativas() {
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        try {
            aluno.setQuantidadeParcelasIsentas(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarInfoAluno() {
        Curso curso = new Curso();

        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral(curso);
        aluno.setNome("Guilherme");
        aluno.setMatricula(777);
        aluno.setEndereco("Rua X");
        aluno.setQuantidadeParcelasIsentas(10);

        curso.matricularAluno(aluno);

        String resultadoEsperado = "O aluno Guilherme, de matrícula 777 e " +
                "endereço Rua X, é bolsista integral e não paga mensalidade, " +
                "tendo 10 parcelas isentas.";

        assertEquals(resultadoEsperado, aluno.getInfoAlunoCurso());
    }

}