package lista003.SistemaPedidos;

public abstract class Produto {
    private String nome;
    private float precoBase;

    public Produto() {
        this.nome = "";
        this.precoBase = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        nome = nome.trim();
        if (nome.isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public float getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularPreco();
}
