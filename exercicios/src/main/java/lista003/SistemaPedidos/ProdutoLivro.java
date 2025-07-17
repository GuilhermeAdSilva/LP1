package lista003.SistemaPedidos;

public class ProdutoLivro extends Produto{

    public float calcularPreco() {
        return (this.getPrecoBase() * 0.95f);
    }
}
