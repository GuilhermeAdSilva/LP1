package lista004AssociacaoN.ex08SistemaControleAcademico;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.codigo = 0;
        this.descricao = "";
        this.cargaHoraria = 0;
        this.alunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public int calcularNumeroAlunos() {
        return this.alunos.size();
    }

    public ArrayList<String> listaAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            resultado.add(aluno.getNome());
        }
        return resultado;
    }

    public ArrayList<String> listaAlunosCurso(int codigo) {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            if (aluno.pegarCodigoCurso() == codigo) {
                resultado.add(aluno.getNome());
            }
        }
        return resultado;
    }
}
