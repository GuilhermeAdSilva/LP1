package lista003.SistemaGerenciamentoProdutos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarNomeVazio() {
        try {
            Produto produto = new ProdutoEletronico();
            produto.setNome("     ");
            produto.setPrecoUnitario(0.01f);
            produto.setQuantidadeEstoque(1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPrecoZeradoNegativo() {
        try {
            Produto produto = new ProdutoEletronico();
            produto.setNome("Produto");
            produto.setPrecoUnitario(0);
            produto.setQuantidadeEstoque(1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantiadeEstoqueZeradaNegativa() {
        try {
            Produto produto = new ProdutoEletronico();
            produto.setNome("Produto");
            produto.setPrecoUnitario(0.01f);
            produto.setQuantidadeEstoque(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

}