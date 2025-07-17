package ex003relampagopi;

public class Professor extends Pessoa {
    private Curso curso;

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String retornaTipoCursoProfessor() {
        return curso.retornaTipoEnsino();
    }

    public String retornaDiretor() {
        return curso.retornaNomeDiretor();
    }

    public String retornaCoodernador() {
        return curso.retornaNomeCoodernador();
    }
}
