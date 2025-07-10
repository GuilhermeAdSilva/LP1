package lista004AssociacaoN.ex08SistemaControleAcademico;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveAceitarCodigoMaiorQueZero() {
        Curso curso = new Curso();
        curso.setCodigo(1);
        assertEquals(1, curso.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoZeradoNegativo() {
        Curso curso = new Curso();
        try {
            curso.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAceitarDescricaoNaoVazia() {
        Curso curso = new Curso();
        curso.setDescricao("a");
        assertEquals("a", curso.getDescricao());
    }

    @Test
    void deveLancarExcecaoDescricaoVazia() {
        Curso curso = new Curso();
        try {
            curso.setDescricao(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarCargaMaiorQueZero() {
        Curso curso = new Curso();
        curso.setCargaHoraria(1);
        assertEquals(1, curso.getCargaHoraria());
    }

    @Test
    void deveLancarExcecaoCargaZeradoNegativo() {
        Curso curso = new Curso();
        try {
            curso.setCargaHoraria(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CH invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarZeroAlunos() {
        Curso curso = new Curso();
        assertEquals(0, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        curso.matricularAluno(aluno);
        assertEquals(1, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarMaisDeUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        curso.matricularAluno(aluno);
        curso.matricularAluno(aluno);
        assertEquals(2, curso.calcularNumeroAlunos());
    }

    @Test
    void deveRetornarListaAlunosResumida() {
        Curso curso = new Curso();

        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        curso.matricularAluno(aluno);

        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Pedro");
        curso.matricularAluno(aluno2);

        AlunoBolsistaIntegral aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        curso.matricularAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Guilherme");
        resultadoEsperado.add("Pedro");
        resultadoEsperado.add("Marco");

        assertEquals(resultadoEsperado, curso.listaAlunosResumida());
    }

    @Test
    void deveRetornarListaAlunos() {
        Curso curso = new Curso();

        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        aluno.setMatricula(123);
        aluno.setEndereco("Rua A");
        aluno.setValorMensalidade(100);
        aluno.setQuantidadeParcelas(10);

        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Pedro");
        aluno2.setMatricula(321);
        aluno2.setEndereco("Rua B");
        aluno2.setValorMensalidade(100);
        aluno2.setPercentualDesconto(10);
        aluno2.setQuantidadeParcelas(10);


        AlunoBolsistaIntegral aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        aluno3.setMatricula(777);
        aluno3.setEndereco("Rua X");
        aluno3.setQuantidadeParcelasIsentas(10);

        curso.matricularAluno(aluno);
        curso.matricularAluno(aluno2);
        curso.matricularAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("O aluno Guilherme, de matrícula 123 e " +
                "endereço Rua A, é mensalista e tem valor de mensalidade " +
                "a ser pago de 100.0, em 10 parcelas.");
        resultadoEsperado.add("O aluno Pedro, de matrícula 321 e " +
                "endereço Rua B, é bolsista parcial e tem valor de mensalidade " +
                "a ser pago de 90.0, em 10.0 parcelas.");
        resultadoEsperado.add("O aluno Marco, de matrícula 777 e " +
                "endereço Rua X, é bolsista integral e não paga mensalidade, " +
                "tendo 10 parcelas isentas.");

        assertEquals(resultadoEsperado, curso.listaAlunos());
    }

    @Test
    void deveRetornarListaAlunosCursoResumida() {
        Curso curso = new Curso();
        curso.setCodigo(1);
        Curso curso2 = new Curso();
        curso2.setCodigo(2);
        Aluno aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        Aluno aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Pedro");
        Aluno aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        curso.matricularAluno(aluno);
        curso.matricularAluno(aluno2);
        curso2.matricularAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Guilherme");
        resultadoEsperado.add("Pedro");

        assertEquals(resultadoEsperado, curso.listaAlunosCursoResumida(1));
    }

    @Test
    void deveRetornarListaAlunosCurso() {
        Curso curso = new Curso();
        curso.setCodigo(1);
        Curso curso2 = new Curso();
        curso2.setCodigo(2);

        AlunoMensalista aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        aluno.setMatricula(123);
        aluno.setEndereco("Rua A");
        aluno.setValorMensalidade(100);
        aluno.setQuantidadeParcelas(10);

        AlunoBolsistaParcial aluno2 = new AlunoBolsistaParcial(curso2);
        aluno2.setNome("Pedro");
        aluno2.setMatricula(321);
        aluno2.setEndereco("Rua B");
        aluno2.setValorMensalidade(100);
        aluno2.setPercentualDesconto(10);
        aluno2.setQuantidadeParcelas(10);

        curso.matricularAluno(aluno);
        curso.matricularAluno(aluno2);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("O aluno Guilherme, de matrícula 123 e endereço " +
                "Rua A, é mensalista e tem valor de mensalidade a ser pago de " +
                "100.0, em 10 parcelas.");

        assertEquals(resultadoEsperado, curso.listaAlunosCurso(1));
    }

}