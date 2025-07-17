package lista003.SistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveCalcularPreco() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa();
        produtoRoupa.setPrecoBase(100);
        assertEquals(80, produtoRoupa.calcularPreco());
    }

}