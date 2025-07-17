package lista003.SistemaGerenciamentoProdutos;

public class ProdutoAlimento extends Produto{

    public float calcularPreco(int quantidadeComprada) {
        if (quantidadeComprada > this.getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        return (getPrecoUnitario() * quantidadeComprada);
    }

}
