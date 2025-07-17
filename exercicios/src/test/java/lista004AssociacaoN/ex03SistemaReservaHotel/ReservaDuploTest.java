package lista004AssociacaoN.ex03SistemaReservaHotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaDuploTest {
    @Test
    void deveVerificarNumeroValidoRefeicoes() {
        Hospede hospede = new Hospede();
        ReservaDuplo reservaDuplo = new ReservaDuplo(hospede);
        reservaDuplo.setNumeroRefeicoes(0);
        assertEquals(0, reservaDuplo.getNumeroRefeicoes());
    }

    @Test
    void deveLancarExcecaoNumeroRefeicoesNegativo() {
        Hospede hospede = new Hospede();
        ReservaDuplo reservaDuplo = new ReservaDuplo(hospede);
        try {
            reservaDuplo.setNumeroRefeicoes(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero de refeições invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoReserva() {
        Hospede hospede = new Hospede();
        ReservaDuplo reserva = new ReservaDuplo(hospede);
        assertEquals("Duplo", reserva.getTipoReserva());
    }

}