package lista004AssociacaoN.ex08SistemaControleAcademico;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
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
    void deveRetornarListaAlunos() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso);
        aluno.setNome("Guilherme");
        Aluno aluno2 = new AlunoBolsistaParcial(curso);
        aluno2.setNome("Pedro");
        Aluno aluno3 = new AlunoBolsistaIntegral(curso);
        aluno3.setNome("Marco");
        curso.matricularAluno(aluno);
        curso.matricularAluno(aluno2);
        curso.matricularAluno(aluno3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Guilherme");
        resultadoEsperado.add("Pedro");
        resultadoEsperado.add("Marco");

        assertEquals(resultadoEsperado, curso.listaAlunos());
    }

    @Test
    void deveRetornarListaAlunosCurso() {
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

        assertEquals(resultadoEsperado, curso.listaAlunosCurso(1));
    }

}