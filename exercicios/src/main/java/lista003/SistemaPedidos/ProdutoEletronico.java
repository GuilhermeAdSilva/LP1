package lista003.SistemaPedidos;

public class ProdutoEletronico extends Produto{

    public float calcularPreco() {
        return (this.getPrecoBase() * 0.9f);
    }
}
