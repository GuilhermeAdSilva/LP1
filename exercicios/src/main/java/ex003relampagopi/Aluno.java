package ex003relampagopi;

public class Aluno extends Pessoa{
    private Curso curso;

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String retonaCoodernador() {
        return curso.retornaNomeCoodernador();
    }
}
