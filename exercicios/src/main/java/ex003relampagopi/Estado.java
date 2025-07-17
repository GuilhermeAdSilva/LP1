package ex003relampagopi;

public class Estado {
    private String nome;

    public Estado(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Estado Invalido");
        } else {
            this.nome = nome;
        }
    }
}
