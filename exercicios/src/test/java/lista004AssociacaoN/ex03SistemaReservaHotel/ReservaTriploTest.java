package lista004AssociacaoN.ex03SistemaReservaHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTriploTest {
    @Test
    void deveVerificarNumeroValidoRefeicoes() {
        Hospede hospede = new Hospede();
        ReservaTriplo reservaTriplo = new ReservaTriplo(hospede);
        reservaTriplo.setNumeroRefeicoes(0);
        assertEquals(0, reservaTriplo.getNumeroRefeicoes());
    }

    @Test
    void deveLancarExcecaoNumeroRefeicoesNegativo() {
        Hospede hospede = new Hospede();
        ReservaTriplo reservaTriplo = new ReservaTriplo(hospede);
        try {
            reservaTriplo.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de refeições invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoReserva() {
        Hospede hospede = new Hospede();
        ReservaTriplo reserva = new ReservaTriplo(hospede);
        assertEquals("Triplo", reserva.getTipoReserva());
    }

}