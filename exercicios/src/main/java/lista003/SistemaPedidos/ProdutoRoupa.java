package lista003.SistemaPedidos;

public class ProdutoRoupa extends Produto{

    public float calcularPreco() {
        return (this.getPrecoBase() * 0.8f);
    }
}
