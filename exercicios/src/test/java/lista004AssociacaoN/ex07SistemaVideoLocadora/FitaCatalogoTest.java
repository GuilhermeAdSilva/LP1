package lista004AssociacaoN.ex07SistemaVideoLocadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaCatalogoTest {
    @Test
    void deveRetornarTipoFitaCliente() {
        FitaCatalogo fita = new FitaCatalogo();
        assertEquals("Fita Catálogo", fita.getTipoFitaCliente());
    }

}