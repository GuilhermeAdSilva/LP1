package lista003.SistemaGerenciamentoProdutos;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;

    public Produto() {
        this.nome = "";
        this.precoUnitario = 0;
        this.quantidadeEstoque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome.trim();
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque <= 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract float calcularPreco(int quantidadeComprada);
}
