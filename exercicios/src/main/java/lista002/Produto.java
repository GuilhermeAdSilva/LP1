/*Atributos: nome, preco, quantidade_estoque, categoria
Métodos: adicionar_estoque, remover_estoque, aplicar_desconto
• adicionar_estoque(quantidade): Adiciona quantidade ao quantidade_estoque.
• remover_estoque(quantidade): Remove quantidade do quantidade_estoque, se houver quantidade suficiente.
• aplicar_desconto(percentual): Aplica um desconto de percentual ao preco do produto.*/

package lista002;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade_estoque;
    private String categoria;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return this.quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        if (quantidade_estoque < 0) {
            throw new IllegalArgumentException("Estoque nao pode ser negativo");
        }
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void adicionar_estoque(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Nao e possivel adicionar");
        }
        this.quantidade_estoque += quantidade;
    }

    public void remover_estoque(int quantidade) {
        if (quantidade > this.quantidade_estoque) {
            throw new IllegalArgumentException("Nao ha produtos suficientes");
        }
        this.quantidade_estoque -= quantidade;
    }

    public float aplicar_desconto(float percentual) {
        if (percentual <= 0) {
            throw new IllegalArgumentException("Percentual de desconto invalido");
        }
        return this.preco * ((100-percentual)/100);
    }
}
