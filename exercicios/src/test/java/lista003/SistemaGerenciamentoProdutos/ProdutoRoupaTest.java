package lista003.SistemaGerenciamentoProdutos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveVerificarEstoqueInsuficiente() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Produto");
        produtoRoupa.setPrecoUnitario(1);
        try {
            produtoRoupa.setQuantidadeEstoque(1);
            produtoRoupa.calcularPreco(2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque insuficiente", e.getMessage());
        }
    }

    @Test
    void deveVerificarDescontoNegativo() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Produto");
        produtoRoupa.setPrecoUnitario(1);
        produtoRoupa.setQuantidadeEstoque(10);
        try {
            produtoRoupa.setDesconto(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Desconto invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPrecoSemDesconto() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Produto");
        produtoRoupa.setPrecoUnitario(1);
        produtoRoupa.setQuantidadeEstoque(10);
        produtoRoupa.setDesconto(0);
        assertEquals(2.00f, produtoRoupa.calcularPreco(2));
    }

    @Test
    void deveCalcularPrecoComDesconto() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setNome("Produto");
        produtoRoupa.setPrecoUnitario(1);
        produtoRoupa.setQuantidadeEstoque(10);
        produtoRoupa.setDesconto(50);
        assertEquals(1.00f, produtoRoupa.calcularPreco(2));
    }
}