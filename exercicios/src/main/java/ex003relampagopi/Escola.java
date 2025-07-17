package ex003relampagopi;

public class Escola {
    private Cidade cidade;
    private Professor diretor;

    public Escola(Cidade cidade) {
        this.setCidade(cidade);
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String retornarEscolaridadeDiretor() {
        return diretor.getNomeEscolaridade();
    }
}
