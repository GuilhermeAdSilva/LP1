package lista003.SistemaPedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveCalcularPreco() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico();
        produtoEletronico.setPrecoBase(100);
        assertEquals(90, produtoEletronico.calcularPreco());
    }
}