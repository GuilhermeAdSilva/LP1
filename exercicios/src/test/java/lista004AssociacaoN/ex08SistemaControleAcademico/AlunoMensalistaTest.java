package lista004AssociacaoN.ex08SistemaControleAcademico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {
    Curso curso;
    @BeforeEach
    void setUp() {
        curso = new Curso();
    }

    @Test
    void deveAceitarValorMensalidadeMaiorZero() {
        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setValorMensalidade(0.01f);
        assertEquals(0.01f, aluno.getValorMensalidade());
    }

    @Test
    void deveLancarExcecaoValorMensalidadeZeradoNegativo() {
        AlunoMensalista aluno = new AlunoMensalista(curso);
        try {
            aluno.setValorMensalidade(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Mensalidade invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarQuantidadeParcelasMaiorZero() {
        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setQuantidadeParcelas(1);
        assertEquals(1, aluno.getQuantidadeParcelas());
    }

    @Test
    void deveLancarExcecaoQuantidadeParcelasZeradoNegativo() {
        AlunoMensalista aluno = new AlunoMensalista(curso);
        try {
            aluno.setQuantidadeParcelas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade de parcelas invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarInfoAluno() {
        Curso curso = new Curso();

        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        aluno.setMatricula(123);
        aluno.setEndereco("Rua A");
        aluno.setValorMensalidade(100);
        aluno.setQuantidadeParcelas(10);

        curso.matricularAluno(aluno);

        String resultadoEsperado = "O aluno Guilherme, de matrícula 123 e " +
                "endereço Rua A, é mensalista e tem valor de mensalidade " +
                "a ser pago de 100.0, em 10 parcelas.";

        assertEquals(resultadoEsperado, aluno.getInfoAlunoCurso());
    }

}