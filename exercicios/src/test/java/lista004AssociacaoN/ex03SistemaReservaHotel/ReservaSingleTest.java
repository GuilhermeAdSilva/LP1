package lista004AssociacaoN.ex03SistemaReservaHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaSingleTest {
    @Test
    void deveRetornarTipoReserva() {
        Hospede hospede = new Hospede();
        ReservaSingle reserva = new ReservaSingle(hospede);
        assertEquals("Single", reserva.getTipoReserva());
    }

}