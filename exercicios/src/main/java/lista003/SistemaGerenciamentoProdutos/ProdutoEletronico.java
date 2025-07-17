package lista003.SistemaGerenciamentoProdutos;

public class ProdutoEletronico extends Produto{

    public float calcularPreco(int quantidadeComprada) {
        if (quantidadeComprada > this.getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Estoque insuficiente");
        }
        return (getPrecoUnitario() * quantidadeComprada);
    }
}
