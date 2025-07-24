package exercicioRelampagoSurpresa;

public class Pessoa {

    private String nome;

    public Pessoa(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
}