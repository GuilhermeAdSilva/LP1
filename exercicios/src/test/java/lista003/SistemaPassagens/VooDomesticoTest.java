package lista003.SistemaPassagens;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPreco() {
        VooDomestico vooDomestico = new VooDomestico("Madri", 1f, "Amsterda", "07-09-2030", 1);
        assertEquals(1, vooDomestico.calcularPreco());
    }
}