package ex003relampagopi;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade;
    private Estado estado;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }

    public String getNomeCidade(){
        return this.cidade.getNome();
    }

    public String getNomeEstado(){
        return this.estado.getNome();
    }

    public String retornarNaturalidade() {
        return this.getNomeCidade() + ", " + this.getNomeEstado();
    }
}
