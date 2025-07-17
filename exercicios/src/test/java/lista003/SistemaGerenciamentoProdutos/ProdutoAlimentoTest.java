package lista003.SistemaGerenciamentoProdutos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    @Test
    void deveVerificarEstoqueInsuficiente() {
        ProdutoAlimento produtoAlimento = new ProdutoAlimento();
        produtoAlimento.setNome("Produto");
        produtoAlimento.setPrecoUnitario(1);
        try {
            produtoAlimento.setQuantidadeEstoque(1);
            produtoAlimento.calcularPreco(2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco() {
        ProdutoAlimento produtoAlimento = new ProdutoAlimento();
        produtoAlimento.setNome("Produto");
        produtoAlimento.setPrecoUnitario(1);
        produtoAlimento.setQuantidadeEstoque(10);
        assertEquals(2.00f, produtoAlimento.calcularPreco(2));
    }

}