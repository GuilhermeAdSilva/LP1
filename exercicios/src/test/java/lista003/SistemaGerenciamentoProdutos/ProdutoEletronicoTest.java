package lista003.SistemaGerenciamentoProdutos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveVerificarEstoqueInsuficiente() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Produto");
        produtoEletronico.setPrecoUnitario(1);
        try {
            produtoEletronico.setQuantidadeEstoque(1);
            produtoEletronico.calcularPreco(2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setNome("Produto");
        produtoEletronico.setPrecoUnitario(1);
        produtoEletronico.setQuantidadeEstoque(10);
        assertEquals(2.00f, produtoEletronico.calcularPreco(2));
    }
}