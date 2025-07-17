package lista002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;
    @BeforeEach
    public void setUp() {
        produto = new Produto();
    }

    @Test
    public void deveVerificarPrecoZerado() {
        try {
            produto.setPreco(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    public void deveVerificarEstoqueNegativo() {
        try {
            produto.setQuantidade_estoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estoque nao pode ser negativo", e.getMessage());
        }
    }

    @Test
    public void deveAdicionarEstoque() {
        produto.setQuantidade_estoque(5);
        produto.adicionar_estoque(2);
        assertEquals(7, produto.getQuantidade_estoque());
    }

    @Test
    public void deveVerificarAdicionarEstoqueZerado() {
        try {
            produto.adicionar_estoque(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao e possivel adicionar", e.getMessage());
        }
    }

    @Test
    public void deveRemoverEstoque() {
        produto.setQuantidade_estoque(5);
        produto.remover_estoque(2);
        assertEquals(3, produto.getQuantidade_estoque());
    }

    @Test
    public void deveVerificarRemoverEstoqueInsuficiente() {
        try {
            produto.setQuantidade_estoque(1);
            produto.remover_estoque(2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao ha produtos suficientes", e.getMessage());
        }
    }

    @Test
    public void deveAplicarDesconto() {
        produto.setPreco(10);
        assertEquals(7.5f, produto.aplicar_desconto(25));
    }

    @Test
    public void deveVerificarPercentualDescontoZerado() {
        try {
            produto.aplicar_desconto(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de desconto invalido", e.getMessage());
        }
    }
}