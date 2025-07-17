package lista003.SistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarNomeValido() {
        Produto produto = new ProdutoEletronico();
        produto.setNome(" Guilherme ");
        assertEquals("Guilherme", produto.getNome());
    }

    @Test
    void deveVerificarNomeVazio() {
        try {
            Produto produto = new ProdutoEletronico();
            produto.setNome("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPrecoValido() {
        Produto produto = new ProdutoEletronico();
        produto.setPrecoBase(0.01f);
        assertEquals(0.01f, produto.getPrecoBase());
    }

    @Test
    void deveVerificarPrecoZeradoNegativo() {
        try {
            Produto produto = new ProdutoEletronico();
            produto.setPrecoBase(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

}