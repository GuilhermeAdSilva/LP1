package lista003.SistemaPassagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    @Test
    void deveInstanciarObjeto() {
        Voo voo = new VooDomestico("Madri", 0.01f, "Amsterda", "07-09-2030", 0.01f);
        assertEquals("Madri", voo.getOrigem());
        assertEquals(0.01f, voo.getDistancia());
        assertEquals("Amsterda", voo.getDestino());
        assertEquals("07-09-2030", voo.getData());
    }

    @Test
    void deveVerificarOrigemVazia() {
        try {
            Voo voo = new VooDomestico("", 0.01f, "Amsterda", "07-09-2030", 0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Origem invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarDistanciaZeradaNegativa() {
        try {
            Voo voo = new VooDomestico("Madri", 0, "Amsterda", "07-09-2030", 0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distancia invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarDestinoVazio() {
        try {
            Voo voo = new VooDomestico("Madri", 0.01f, "", "07-09-2030", 0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarDataVazia() {
        try {
            Voo voo = new VooDomestico("Madri", 0.01f, "Amsterda", "", 0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data invalida", e.getMessage());
        }
    }

    @Test
    void deveAceitarFatorEspecifico() {
        Voo voo = new VooDomestico("Madri", 0.01f, "Amsterda", "07-09-2030", 0.01f);
        assertEquals(0.01f, voo.getFatorEspecifico());
    }

    @Test
    void deveVerificarFatorEspecificoZeradoNegativo() {
        try {
            Voo voo = new VooDomestico("Madri", 0.01f, "Amsterda", "07-09-2030", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fator de voo invalido", e.getMessage());
        }
    }

}