package lista004AssociacaoN.ex03SistemaReservaHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    @Test
    void deveVerificarNumeroDiasValido() {
        Hospede hospede = new Hospede();
        Reserva reserva = new ReservaTriplo(hospede);
        reserva.setDiasHospedagem(1);
        assertEquals(1, reserva.getDiasHospedagem());
    }

    @Test
    void deveLancarExcecaoNumeroDiasZeradoNegativo() {
        Hospede hospede = new Hospede();
        Reserva reserva = new ReservaTriplo(hospede);
        try {
            reserva.setDiasHospedagem(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Dias invalidos", e.getMessage());
        }

    }

}