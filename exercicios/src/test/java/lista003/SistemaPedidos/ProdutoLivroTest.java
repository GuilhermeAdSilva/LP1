package lista003.SistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveCalcularPreco() {
        ProdutoLivro produtoLivro = new ProdutoLivro();
        produtoLivro.setPrecoBase(100);
        assertEquals(95, produtoLivro.calcularPreco());
    }
}