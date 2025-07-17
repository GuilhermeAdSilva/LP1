package ex003relampagopi;

public class Curso {
    private Escola escola;
    private TipoEnsino tipoEnsino;
    private Professor coodernador;

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public Professor getCoodernador() {
        return this.coodernador;
    }

    public void setCoodernador(Professor coodernador) {
        this.coodernador = coodernador;
    }

    public String escolaridadeCoodernador() {
        return coodernador.getNomeEscolaridade();
    }

    public String retornaTipoEnsino() {
        return this.getTipoEnsino().getNome();
    }

    public String retornaNomeCoodernador() {
        return coodernador.getNome();
    }

    public String retornaNomeDiretor() {
        return escola.getDiretor().getNome();
    }


}
