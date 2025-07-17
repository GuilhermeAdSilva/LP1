package lista003.SistemaGerenciamentoProdutos;

public class ProdutoRoupa extends Produto {
    private float desconto;

    public ProdutoRoupa() {
        this.desconto = 0;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        if (desconto < 0) {
            throw new IllegalArgumentException("Desconto invalido");
        }
        this.desconto = desconto;
    }

    public float calcularPreco(int quantidadeComprada) {
        if (quantidadeComprada > this.getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        if (this.desconto == 0) {
            return (getPrecoUnitario() * quantidadeComprada);
        }
        return (getPrecoUnitario() * quantidadeComprada) * (1-(this.desconto / 100));
    }
}
